import { TypedValue } from '../types';
import { Token } from './tokenize';

export interface Atom {
  eval(context: TypedValue[]): TypedValue[];
}

export interface PrefixParselet {
  parse(parser: Parser, token: Token): Atom;
}

export interface InfixParselet {
  precedence: number;
  parse(parser: Parser, left: Atom, token: Token): Atom;
}

export class ParserBuilder {
  readonly #prefixParselets: Record<string, PrefixParselet> = {};
  readonly #infixParselets: Record<string, InfixParselet> = {};

  public registerInfix(tokenType: string, parselet: InfixParselet): ParserBuilder {
    this.#infixParselets[tokenType] = parselet;
    return this;
  }

  public registerPrefix(tokenType: string, parselet: PrefixParselet): ParserBuilder {
    this.#prefixParselets[tokenType] = parselet;
    return this;
  }

  public prefix(tokenType: string, precedence: number, builder: (token: Token, right: Atom) => Atom): ParserBuilder {
    return this.registerPrefix(tokenType, {
      parse(parser, token) {
        const right = parser.consumeAndParse(precedence);
        return builder(token, right);
      },
    });
  }

  public infixLeft(
    tokenType: string,
    precedence: number,
    builder: (left: Atom, token: Token, right: Atom) => Atom
  ): ParserBuilder {
    return this.registerInfix(tokenType, {
      parse(parser, left, token) {
        const right = parser.consumeAndParse(precedence);
        return builder(left, token, right);
      },
      precedence,
    });
  }

  public construct(input: Token[]): Parser {
    return new Parser(input, this.#prefixParselets, this.#infixParselets);
  }
}

export class Parser {
  #tokens: Token[];
  #prefixParselets: Record<string, PrefixParselet>;
  #infixParselets: Record<string, InfixParselet>;

  constructor(
    tokens: Token[],
    prefixParselets: Record<string, PrefixParselet>,
    infixParselets: Record<string, InfixParselet>
  ) {
    this.#tokens = tokens;
    this.#prefixParselets = prefixParselets;
    this.#infixParselets = infixParselets;
  }

  hasMore(): boolean {
    return this.#tokens.length > 0;
  }

  match(expected: string): boolean {
    const token = this.peek();
    if (token?.id !== expected) {
      return false;
    }

    this.consume();
    return true;
  }

  consumeAndParse(precedence = Infinity): Atom {
    const token = this.consume();
    const prefix = this.#prefixParselets[token.id];
    if (!prefix) {
      throw Error(
        `Parse error at "${token.value}" (line ${token.line}, column ${token.column}). No matching prefix parselet.`
      );
    }

    let left = prefix.parse(this, token);

    while (precedence > this.getPrecedence()) {
      const next = this.consume();
      const infix = this.#infixParselets[next.id];
      left = infix.parse(this, left, next);
    }

    return left;
  }

  getPrecedence(): number {
    const nextToken = this.peek();
    if (!nextToken) {
      return Infinity;
    }
    const parser = this.#infixParselets[nextToken.id];
    if (parser) {
      return parser.precedence;
    }
    return Infinity;
  }

  consume(expected?: string): Token {
    if (!this.#tokens.length) {
      throw Error('Cant consume unknown more tokens.');
    }
    if (expected && this.peek()?.id !== expected) {
      const actual = this.peek() as Token;
      throw Error(`Expected ${expected} but got "${actual.value}" at line ${actual.line} column ${actual.column}.`);
    }
    return this.#tokens.shift() as Token;
  }

  peek(): Token | undefined {
    return this.#tokens.length > 0 ? this.#tokens[0] : undefined;
  }

  removeComments(): void {
    this.#tokens = this.#tokens.filter((t) => t.id !== 'Comment');
  }
}

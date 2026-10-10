# Prefix to Postfix Conversion

## Problem and contract

Convert valid binary expressions with SINGLE-character operands, operators +,-,*,/,^ and parentheses where applicable. ^ denotes right-associative exponentiation for this parser, not Java XOR.

## Approach

Infix uses an operator stack by precedence, popping equal precedence except for right-associative ^. Prefix/postfix conversion scans in the appropriate direction and combines the two operand expressions in their original left/right order.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

a+b*c groups multiplication before addition: postfix abc*+, prefix +a*bc, fully parenthesized infix (a+(b*c)).

## Complexity

Infix-to-postfix O(n) time/space; string-building conversions can be O(n²) worst time/storage due to immutable intermediate concatenations. Expression trees/StringBuilder traversals can improve output construction.

## Edge cases and Java 8 mistakes

Unary minus and multi-character tokens are outside the grammar. The parser assumes a valid infix token sequence; it checks mismatched parentheses and conversion stack underflow.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
abc*+
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

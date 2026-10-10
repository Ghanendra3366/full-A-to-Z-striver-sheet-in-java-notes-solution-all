# Expression Add Operators

## Problem and contract

Insert +,-,* between digit groups to reach target; preserve digit order, use no parentheses and forbid multi-digit leading-zero operands.

## Approach

Track total and the last signed multiplicative term. Multiplication replaces last with last*x in total, enforcing precedence without reparsing. Try all token endpoints and all operators.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1+2 then *3 would replace +2 with +6, giving 7; 1*2*3 correctly evaluates 6.

## Complexity

Exponential O(n*4^n) loose search/string-cost bound, with additional BigInteger bit costs; O(n) depth plus expression storage/output.

## Edge cases and Java 8 mistakes

BigInteger prevents expression overflow. A token 0 is valid, but 00 is not.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1+2+3, 1*2*3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

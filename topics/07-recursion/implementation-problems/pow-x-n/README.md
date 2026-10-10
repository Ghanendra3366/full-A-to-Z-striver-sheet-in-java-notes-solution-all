# Pow(x,n)

## Problem and contract

Compute x raised to an int exponent using IEEE-754 double arithmetic; 0^0 returns 1.

## Approach

Binary exponentiation keeps ans*x^remaining equal to the desired result. Consume low bits; square the base as the exponent halves.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

2^-3 becomes 0.5^3: take 0.5, square to 0.25, then take it -> 0.125.

## Complexity

O(log(|n|+1)) time; O(1) space.

## Edge cases and Java 8 mistakes

Cast exponent to long before negating MIN_VALUE. Double overflow/underflow follows IEEE-754; this is not exact rational arithmetic.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
0.125
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# LCM of two numbers

## Problem and contract

Return nonnegative lcm; if either input is zero, return zero.

## Approach

gcd*lcm = |a*b|. Divide before multiplying to reduce the intermediate magnitude.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

gcd(12,18)=6; (12/6)*18=36.

## Complexity

O(log(min(|a|,|b|)+1)) time, O(1) space.

## Edge cases and Java 8 mistakes

Use long and do the zero check before division. This handles all pairs of int inputs.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
36
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

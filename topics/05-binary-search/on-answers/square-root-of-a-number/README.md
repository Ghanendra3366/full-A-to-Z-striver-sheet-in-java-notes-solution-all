# Square Root of a Number

## Problem and contract

Return floor(sqrt(n)) for n>=0.

## Approach

Search the largest m with m²<=n. Check m<=n/m to avoid multiplication overflow.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

46340²<=2147483647; 46341² is larger.

## Complexity

O(log(n+1)) time; O(1) space.

## Edge cases and Java 8 mistakes

Search starts at 1, so division by zero is impossible; n=0 leaves answer 0.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
46340
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

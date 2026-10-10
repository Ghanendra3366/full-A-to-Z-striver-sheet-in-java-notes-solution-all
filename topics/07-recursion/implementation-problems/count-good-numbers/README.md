# Count Good Numbers

## Problem and contract

Length-n digit strings have an even digit at every zero-based even position and a prime digit at every odd position. Leading zeros allowed; return modulo 1e9+7.

## Approach

Even positions have five choices {0,2,4,6,8}; odd positions four {2,3,5,7}. Independent choices multiply, so use 5^ceil(n/2)*4^floor(n/2) with modular exponentiation.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

n=4 has two positions of each kind: 5²*4²=400.

## Complexity

O(log(n+1)) time; O(1) space.

## Edge cases and Java 8 mistakes

Use n/2+n%2 rather than (n+1)/2 to avoid long overflow. n=0 represents one empty string.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
400
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

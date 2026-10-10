# House robber

## Problem and contract

Circular house-robber variant: first and last are adjacent, nonnegative amounts.

## Approach

No valid solution takes both endpoints. Maximize the two linear cases excluding last or excluding first; together they cover every feasible selection.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

[2,3,2]: endpoints cannot both be chosen; pick 3.

## Complexity

O(n) time, O(1) space.

## Edge cases and Java 8 mistakes

This sheet lesson uses the circular variant (House Robber II). The preceding nonadjacent lesson covers the ordinary linear version.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

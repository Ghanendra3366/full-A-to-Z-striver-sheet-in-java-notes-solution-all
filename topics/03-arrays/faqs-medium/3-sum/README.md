# 3 Sum

## Problem and contract

Return unique value triples with zero sum, using distinct indices. Input is not mutated.

## Approach

Sort a copy. Fix the first value, then move left/right based on sum. Sorted order proves that when sum is low, increasing left is the only useful direction. Skip equal fixed and endpoint values.

## Other approaches

Enumerating all index triples takes O(n³), plus deduplication storage.

## Dry run

Sorted [-4,-1,-1,0,1,2]; with fixed -1 find (-1,2), then (0,1).

## Complexity

O(n²) time after sorting; O(n) copy plus result space.

## Edge cases and Java 8 mistakes

Use long sum to avoid int overflow. Unique value triples differ from unique index triples.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[-1, -1, 2], [-1, 0, 1]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

# Power Set

## Problem and contract

Enumerate positional subsets; skip branch is visited before take branch. Duplicate values may give equal value lists.

## Approach

At each index choose skip or take. Copy the path at a leaf to prevent later mutations from changing stored results.

## Other approaches

Bitmask enumeration gives the same asymptotic costs with a different order.

## Dry run

Skip 1/skip 2 -> []; skip 1/take 2 -> [2]; take 1/skip 2 -> [1]; take both -> [1,2].

## Complexity

O(n*2^n) time/output space; O(n) stack and working path.

## Edge cases and Java 8 mistakes

Use remove(size-1), not remove(value), when restoring a path. Enumeration includes the empty subset.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[], [2], [1], [1, 2]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

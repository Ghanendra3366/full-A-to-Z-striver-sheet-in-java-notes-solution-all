# Merge Intervals

## Problem and contract

Merge overlapping closed intervals; touching endpoints merge. Return a new array.

## Approach

Sort by start. A new interval either extends the last merged block or starts a new disjoint block. Future starts cannot overlap earlier blocks without also reaching the last.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[1,3] and [2,6] combine to [1,6]; subsequent starts 8 and 15 create new blocks.

## Complexity

O(n log n) time; O(n) space.

## Edge cases and Java 8 mistakes

Use max on end: a contained interval must not shrink a block. Inputs are copied.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[1, 6], [8, 10], [15, 18]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Fruit Into Baskets

## Problem and contract

Collect the longest contiguous run using at most two fruit types.

## Approach

Keep a frequency map for the window. Shrink until there are no more than two keys; counts are required to know when a type fully leaves.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[1,2,1,2] fits two types; adding 3 forces the window to shrink.

## Complexity

Expected O(n) time; O(1) type-map space since at most three types are temporarily stored.

## Edge cases and Java 8 mistakes

This asks for a contiguous interval, not the two most frequent types in the whole array.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

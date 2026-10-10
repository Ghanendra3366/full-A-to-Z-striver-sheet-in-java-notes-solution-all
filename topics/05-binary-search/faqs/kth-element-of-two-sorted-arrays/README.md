# Kth Element of Two Sorted Arrays

## Problem and contract

Return the ONE-based kth smallest entry of the combined sorted arrays, counting duplicates.

## Approach

Partition both arrays with exactly k entries on the left. A valid partition has left maxima <= opposite right minima; its largest left value is the kth entry.

## Other approaches

A two-pointer merge can stop at k in O(k) time and O(1) auxiliary space.

## Dry run

For k=5, left sides [2,3,6] and [1,4] contain five values; max left is 6.

## Complexity

O(log(min(n,m)+1)) time; O(1) auxiliary space.

## Edge cases and Java 8 mistakes

Use long infinities so real MIN_VALUE/MAX_VALUE are not confused with boundaries. Both arrays must be sorted.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
6
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

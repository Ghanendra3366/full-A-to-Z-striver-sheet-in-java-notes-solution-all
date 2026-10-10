# Insert Interval

## Problem and contract

Insert a closed interval and merge overlaps. This implementation accepts unsorted input too.

## Approach

Append the new interval and reuse general sort-and-merge. Correctness follows from the merge invariant.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sort [1,3],[2,5],[6,9], merging the first two.

## Complexity

O(n log n) time; O(n) space.

## Edge cases and Java 8 mistakes

When original input is already sorted and disjoint, a three-phase scan gives O(n) time: copy before, merge overlaps, copy after.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[1, 5], [6, 9]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

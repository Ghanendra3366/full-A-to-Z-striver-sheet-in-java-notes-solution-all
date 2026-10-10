# Search in Rotated Sorted Array I

## Problem and contract

Search a rotated nondecreasing array of distinct values; return index or -1.

## Approach

At least one side of mid is sorted. Check whether target lies in that sorted interval; keep that side or the other. Equal endpoints/mid can hide the sorted side, so trim endpoints for the duplicate variant.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[4,5,6,7,0,1,2]: left of 7 is sorted, but 0 lies outside; search right and find index 4.

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

Distinct-input reasoning alone cannot resolve all-equal endpoints. Shrinking duplicates degrades worst-case time to linear.

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

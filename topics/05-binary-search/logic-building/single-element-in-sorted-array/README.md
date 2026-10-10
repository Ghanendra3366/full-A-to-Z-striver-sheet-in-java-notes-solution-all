# Single Element in Sorted Array

## Problem and contract

A sorted odd-length array has one single value; every other value appears exactly twice. Return the single.

## Approach

Before the single, pairs start at even indices. Force mid to be even: if mid/mid+1 match, the single is later; otherwise it is at or before mid.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For [1,1,2,3,3,4,4], even mid 2 mismatches 3; left half contains single 2.

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

Contract requires exactly paired other values. Singleton input is valid.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

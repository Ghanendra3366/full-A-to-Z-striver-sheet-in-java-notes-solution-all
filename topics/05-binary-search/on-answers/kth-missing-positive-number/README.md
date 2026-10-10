# Kth Missing Positive Number

## Problem and contract

Given strictly increasing positive integers, return kth missing positive, k>=1.

## Approach

Missing count before a[i] is a[i]-(i+1). Binary search the first count at least k. Before that boundary, l actual values shift the answer to k+l.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Missing positives are 1,5,6,8,9; the fifth is 9.

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

Input must be positive, sorted and distinct; empty input returns k. Overflow is explicitly rejected.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
9
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

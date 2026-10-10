# Smallest Divisor Given a Threshold

## Problem and contract

For nonnegative values, find the smallest positive divisor d for which sum ceil(a[i]/d)<=threshold.

## Approach

The ceiling sum is nonincreasing as divisor increases. Search its first threshold-satisfying point.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

d=5 yields 1+1+1+2=5; d=4 yields 1+1+2+3=7.

## Complexity

O(n log maxValue) time; O(1) space.

## Edge cases and Java 8 mistakes

An all-zero array admits divisor 1. Threshold smaller than the count of positive values is impossible.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

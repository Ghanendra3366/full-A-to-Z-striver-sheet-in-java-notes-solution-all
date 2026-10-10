# Longest subarray with sum K

## Problem and contract

Return the maximum length of a contiguous subarray summing to k; empty/no match returns zero.

## Approach

If prefix[i]-prefix[j]=k, subarray (j,i] sums to k. Keep the EARLIEST index of each prefix sum to maximize length. Seed prefix 0 at index -1.

## Other approaches

Enumerate each start and extend a running sum in O(n²) time/O(1) space.

## Dry run

Prefixes of [1,-1,2,-2,3] are 1,0,2,0,3; zero prefix at i=3 spans four values from index 0.

## Complexity

Expected O(n) time; O(n) space.

## Edge cases and Java 8 mistakes

Negative values invalidate ordinary sum-based sliding windows. Store prefix sums as long; overwriting earliest indices shortens answers.

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

# Subarrays with K Different Integers

## Problem and contract

Count contiguous subarrays with exactly k distinct integers.

## Approach

At-most counts are easier than exactly counts: all suffixes of the longest valid at-most window qualify. The set difference between atMost(k) and atMost(k-1) leaves exactly-k windows.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[1,2,1,2] contributes six two-type windows, and [2,3] contributes one.

## Complexity

Expected O(n) time; O(min(n,k+1)) working-map space for k>=0.

## Edge cases and Java 8 mistakes

Keep multiplicity counts, removing keys only when their count reaches zero. Return long.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
7
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

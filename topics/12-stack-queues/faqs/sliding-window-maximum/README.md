# Sliding Window Maximum

## Problem and contract

Return max for each full contiguous window of width k, 1<=k<=n.

## Approach

Deque holds unexpired indices with strictly decreasing values. A newer value at least as large dominates the older one until expiration. Front is always the current maximum.

## Other approaches

Scanning each window costs O(nk); a heap with lazy expiry costs O(n log n) and can grow beyond k.

## Dry run

Initial window max3; once 5 enters it removes dominated suffix candidates and becomes max.

## Complexity

O(n) time; O(k) deque plus output.

## Edge cases and Java 8 mistakes

Store indices to test expiration; storing values alone cannot distinguish equal old/new entries.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3, 3, 5, 5, 6, 7]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

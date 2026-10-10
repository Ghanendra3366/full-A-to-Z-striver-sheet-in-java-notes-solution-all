# Count number of Nice subarrays

## Problem and contract

Count subarrays containing exactly k odd values, k>=0.

## Approach

Map each value to parity 0/1, then count binary subarrays with sum k using the at-most difference.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[1,1,2,1] and [1,2,1,1] each have three odd values.

## Complexity

O(n) time; O(n) parity array space.

## Edge cases and Java 8 mistakes

Negative odd values are correctly identified by &1. The array conversion could be eliminated for O(1) auxiliary space.

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

[Curriculum index](../../../../COVERAGE.md)

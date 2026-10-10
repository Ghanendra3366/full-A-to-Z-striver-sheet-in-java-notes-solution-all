# Minimum in Rotated Sorted Array

## Problem and contract

For a nonempty rotated array of DISTINCT values return its minimum value.

## Approach

Compare mid with right: if mid is greater, the rotation break is to its right; otherwise mid may be the minimum, so retain it.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

mid at value 1 <= right 3, keep left including mid; answer index 2.

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

With duplicates use r-- when a[mid]==a[r], with O(n) worst time. Distinctness is required by this implementation.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

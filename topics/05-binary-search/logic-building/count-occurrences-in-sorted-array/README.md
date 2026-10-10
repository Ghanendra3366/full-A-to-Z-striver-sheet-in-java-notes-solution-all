# Count Occurrences in Sorted Array

## Problem and contract

Count occurrences of x in a nondecreasing array.

## Approach

Subtract lower from upper boundary of the equal-value block.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

upper 4 minus lower 1 equals 3.

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

Absent values give equal bounds and count zero.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

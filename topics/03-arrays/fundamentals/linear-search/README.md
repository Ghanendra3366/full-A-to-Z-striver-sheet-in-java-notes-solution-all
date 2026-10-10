# Linear Search

## Problem and contract

Return the first zero-based index matching target, or -1.

## Approach

Check entries from left to right. A match is first because all earlier entries were already checked.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[4,2,4], target 4: index 0 matches immediately.

## Complexity

O(n) worst time; O(1) space.

## Edge cases and Java 8 mistakes

Empty input returns -1. An unsorted array cannot use binary search safely.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
0
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

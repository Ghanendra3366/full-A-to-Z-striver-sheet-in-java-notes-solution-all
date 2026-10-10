# Non-overlapping Intervals

## Problem and contract

Return minimum intervals to remove so remaining intervals do not overlap; touching endpoints are allowed.

## Approach

Maximize kept intervals with earliest finishing compatible choices, then subtract from total. The earliest-finish exchange argument proves the kept count is optimal.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Keep [1,2],[2,3],[3,4], removing [1,3].

## Complexity

O(n log n) time; O(n) copy space.

## Edge cases and Java 8 mistakes

This contract uses >= unlike strict meeting scheduling.

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

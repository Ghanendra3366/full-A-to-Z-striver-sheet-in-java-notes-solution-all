# Second Highest Occurring Element

## Problem and contract

Rank distinct values by descending frequency, breaking ties by smaller value. Return the second ranked value, or empty if fewer than two distinct values exist.

## Approach

Count, sort distinct entries, select rank two. This contract allows the first two values to have equal frequency.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

2 occurs three times, 1 twice, 3 once; ranking is 2,1,3.

## Complexity

O(n log u + u log u) time, O(u) space.

## Edge cases and Java 8 mistakes

Second ranked element and second distinct frequency are different variants. OptionalInt avoids a sentinel that could be a valid input.

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

[Curriculum index](../../../../curriculum/COVERAGE.md)

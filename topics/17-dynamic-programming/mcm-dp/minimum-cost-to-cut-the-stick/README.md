# Minimum cost to cut the stick

## Problem and contract

Cut a nonnegative length stick at distinct interior coordinates; each cut costs length of the current piece.

## Approach

Sort cuts with endpoints0,length. Choose FIRST cut k of each interval: current length is paid once, then left/right pieces are independent. Compute increasing spans.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Cut at3 costs7; optimal subpiece cuts total9; total16.

## Complexity

O(c³) time, O(c²) space.

## Edge cases and Java 8 mistakes

Distinct interior cuts are required. No cuts costs zero, including a zero-length stick. Use sorted coordinates and long aggregate cost.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
16
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

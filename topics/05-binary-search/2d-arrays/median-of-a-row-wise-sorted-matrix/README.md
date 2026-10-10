# Median of a Row Wise Sorted Matrix

## Problem and contract

Return the median value of a rectangular row-sorted matrix with an odd number of cells.

## Approach

Search VALUE space. Count values <=mid using upper bounds in each row. The median is the smallest value with more than half the cells at or below it.

## Other approaches

Flatten and sort uses O(N log N) time and O(N) storage.

## Dry run

Flattened sorted values 1,2,3,3,5,6,6,9,9; fifth value is 5.

## Complexity

O(rows*log(cols+1)*log(valueRange+1)) time; O(1) space.

## Edge cases and Java 8 mistakes

Use long value bounds for the full signed-int range. This contract excludes even cell counts.

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

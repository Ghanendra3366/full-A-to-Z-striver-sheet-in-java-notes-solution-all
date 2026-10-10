# Row with Maximum Ones

## Problem and contract

Each binary row is nondecreasing; return the first row with the most ones, or -1 if no ones.

## Approach

First one is lowerBound(1); subtract from row length and retain a strict improvement so ties choose the first row.

## Other approaches

A staircase walk from the top-right can achieve O(rows+cols) for a rectangular row-sorted binary matrix.

## Dry run

Row counts are 1,2,0, so row 1 wins.

## Complexity

O(rows*log(cols+1)) time; O(1) space.

## Edge cases and Java 8 mistakes

Rows need to be sorted. An all-zero matrix returns -1.

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

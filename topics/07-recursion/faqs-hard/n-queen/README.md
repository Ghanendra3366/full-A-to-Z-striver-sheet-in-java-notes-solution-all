# N Queen

## Problem and contract

Return all n-by-n boards with n nonattacking queens, one in each row.

## Approach

Place one queen per row. Boolean column and two diagonal arrays give O(1) conflict tests. Mark -> recurse -> unmark explores every valid placement.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For n=4, columns [1,3,0,2] and [2,0,3,1] are the two valid boards.

## Complexity

O(n*n!) search upper bound plus O(n²) copying per result; O(n²) board and O(n) stack/flags.

## Edge cases and Java 8 mistakes

Diagonal indices are r-c+n-1 and r+c. n=0 gives one empty board.

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

[Curriculum index](../../../../curriculum/COVERAGE.md)

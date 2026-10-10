# Sudoku Solver

## Problem and contract

Solve a 9x9 Sudoku in place, with . for blanks. Return false if invalid or unsolvable, restoring attempted blank assignments.

## Approach

Validate initial clues, then fill the first blank with each row/column/box-compatible digit. A failed continuation restores the blank. An all-filled valid board is the base success.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

First-row blanks are constrained by column and 3x3 box; the completed first row is 534678912.

## Complexity

O(9^E) loose upper bound for E blanks with constant-size checks; O(E) stack.

## Edge cases and Java 8 mistakes

Initial duplicates must be detected, otherwise an already-full invalid board would wrongly return true.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
534678912
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

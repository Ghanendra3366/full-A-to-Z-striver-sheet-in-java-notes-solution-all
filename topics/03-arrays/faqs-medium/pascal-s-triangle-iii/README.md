# Pascal's Triangle III

## Problem and contract

Generate the first n rows, n>=0.

## Approach

Boundary cells are one; each interior cell sums the two parents directly above it. Induction on row proves Pascal recurrence.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Rows: [1], [1,1], [1,2,1], then [1,3,3,1].

## Complexity

O(n²) BigInteger additions; O(n²) output values, whose bit size grows with row.

## Edge cases and Java 8 mistakes

n=0 returns an empty list. Returned rows are separate objects.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

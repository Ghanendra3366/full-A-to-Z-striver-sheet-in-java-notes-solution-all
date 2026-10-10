# Print Longest Common Subsequence

## Problem and contract

Return one actual LCS, using upper-state ties during backtracking.

## Approach

Equal last characters are part of an optimal LCS and move diagonally; otherwise move to a predecessor preserving the larger length. Collected matches are reversed at the end.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Backtrack e,c,a and reverse to ace.

## Complexity

O(n*m) time/space plus O(LCS length) output.

## Edge cases and Java 8 mistakes

One-dimensional LCS lengths alone do not retain the predecessor information needed for this simple reconstruction.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
ace
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Minimum insertions to make string palindrome

## Problem and contract

Return minimum insertions to make a palindrome.

## Approach

The longest palindromic subsequence length equals LCS(s,reverse(s)); keeping it requires mirroring only the remaining n-LPS characters for the minimum-insertion problem.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

bbbab has LPS bbbb length4; one inserted a can pair the unmatched a to make a whole-string palindrome.

## Complexity

O(n²) time/space in this LCS-table version.

## Edge cases and Java 8 mistakes

Interview strings here are ASCII/BMP; surrogate-pair semantics need code-point adaptation. This computes a length, not arbitrary LCS reconstruction as a guaranteed palindrome.

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

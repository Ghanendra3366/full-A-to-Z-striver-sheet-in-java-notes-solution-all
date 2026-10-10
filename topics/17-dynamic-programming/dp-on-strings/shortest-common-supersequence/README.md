# Shortest common supersequence

## Problem and contract

Return a shortest string containing both inputs as subsequences; ties use the stated backtracking choice.

## Approach

Backtrack LCS table. Equal characters are emitted once; otherwise emit the character from the side whose remaining LCS is longer. This shares exactly an LCS and gives length n+m-LCS.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

cabac contains cab and abac in order, length5.

## Complexity

O(n*m) time/space plus output.

## Edge cases and Java 8 mistakes

Shortest output need not be unique. The table backtrack determines one valid answer, not necessarily lexicographically smallest.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
cabac
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

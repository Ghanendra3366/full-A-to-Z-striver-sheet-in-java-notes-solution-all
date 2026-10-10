# Grid unique paths

## Problem and contract

Move only right/down in an obstacle-free rows-by-cols grid; return exact path count.

## Approach

ways[r][c]=ways[r-1][c]+ways[r][c-1]. In a rolling row, d[c] is above and d[c-1] is already current-row left. Seed start with one.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

A 3x7 grid needs two down and six right moves; choose their two down positions among eight gives28.

## Complexity

O(R*C) BigInteger additions; O(C) BigIntegers.

## Edge cases and Java 8 mistakes

Validate nonnegative size/target parameters and respect the stated input domain. Java array dimensions must fit memory; recursion alternatives may exhaust the call stack.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
28
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

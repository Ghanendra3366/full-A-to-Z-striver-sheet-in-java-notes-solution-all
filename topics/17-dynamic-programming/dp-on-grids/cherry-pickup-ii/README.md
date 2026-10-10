# Cherry pickup II

## Problem and contract

Two robots start at row0 columns0,last; each moves down with column delta -1,0,1. Collect both cells, once if coincident; maximize total.

## Approach

State (row,col1,col2) captures both robot positions. Add current reward and maximize over nine next-position pairs; rolling 2D layers retain all dependencies.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Robots collect both edge/frontier rewards while converging on high middle values; shared cells contribute once.

## Complexity

O(R*C²*9) time, O(C²) space.

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
24
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

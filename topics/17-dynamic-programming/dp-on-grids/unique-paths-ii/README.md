# Unique paths II

## Problem and contract

1 denotes obstacle,0 open; move right/down and return exact path count.

## Approach

Blocked cells have zero ways. Others sum above and left using a rolling row. A blocked start correctly resets the initial one to zero.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Center obstacle removes the four central routes; only the top/right boundary and left/bottom boundary routes remain.

## Complexity

O(R*C) BigInteger additions, O(C) retained values.

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
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

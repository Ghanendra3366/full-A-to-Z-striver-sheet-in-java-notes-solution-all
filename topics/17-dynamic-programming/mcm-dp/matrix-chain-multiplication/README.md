# Matrix chain multiplication

## Problem and contract

Matrix i has dims[i] x dims[i+1]; minimize scalar multiplication count, exact BigInteger.

## Approach

For interval[i,j], split at every k; subinterval costs add dims[i]*dims[k+1]*dims[j+1]. Compute increasing interval lengths; singleton cost zero.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Choose grouping ((A1*(A2*A3))*A4):6000+8000+12000=26000.

## Complexity

O(n³) BigInteger operations and O(n²) values.

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
26000
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

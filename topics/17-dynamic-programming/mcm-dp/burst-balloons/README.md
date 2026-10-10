# Burst balloons

## Problem and contract

Burst every nonnegative balloon, earning product of its current neighbors and itself; outside neighbor values one.

## Approach

Choose the LAST balloon k in an interval so its outside neighbors remain fixed. Then solve independent left/right intervals and add the final product.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Burst1 then5 then3 then8 in [3,1,5,8] earns15+120+24+8=167.

## Complexity

O(n³) BigInteger operations, O(n²) values.

## Edge cases and Java 8 mistakes

Choosing first makes changing neighbors entangle intervals; choosing last makes boundaries stable.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
167
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

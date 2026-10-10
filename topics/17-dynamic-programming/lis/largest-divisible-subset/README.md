# Largest Divisible Subset

## Problem and contract

Positive integers; return a largest subset where every pair divides in one direction.

## Approach

Sort and build a longest chain with a[i]%a[j]==0. Divisibility is transitive, so adjacent chain compatibility guarantees all pairs are compatible; reconstruct with predecessors.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

1 divides2 divides4 divides8, so all four fit.

## Complexity

O(n²) time, O(n) space.

## Edge cases and Java 8 mistakes

Zero would make divisor remainder invalid; negative-divisibility ordering needs a different contract.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 4, 8]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

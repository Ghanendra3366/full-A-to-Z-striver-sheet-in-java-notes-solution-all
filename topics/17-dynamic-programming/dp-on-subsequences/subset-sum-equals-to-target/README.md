# Subset sum equals to target

## Problem and contract

Nonnegative values; decide whether a subset sums to target>=0. Empty subset allowed.

## Approach

reachable[s] |= reachable[s-x] updates take/skip states. Descending sums ensure x is used at most once, because s-x still belongs to the prior item layer.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Target6 is reached by2+4 or1+2+3.

## Complexity

O(n*target) time, O(target) space.

## Edge cases and Java 8 mistakes

Ascending sums would allow unlimited reuse; this is a 0/1 subset problem.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

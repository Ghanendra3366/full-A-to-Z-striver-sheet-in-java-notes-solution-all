# Partition a set into two subsets with minimum absolute sum difference

## Problem and contract

Split nonnegative values minimizing absolute difference of the two subset sums.

## Approach

Reachability up to half total suffices by complement symmetry. Largest reachable s<=total/2 minimizes total-2*s.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Total23; subset11 or6+5 yields difference1.

## Complexity

O(n*total) time, O(total) space.

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
1
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

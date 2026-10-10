# Partition equal subset sum

## Problem and contract

Partition all nonnegative entries into two equal-sum subsets.

## Approach

If total is odd impossible; otherwise one subset summing to total/2 leaves the complementary subset with exactly that same sum.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

11 alone matches1+5+5=11.

## Complexity

O(n*totalSum) time, O(totalSum) space.

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
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

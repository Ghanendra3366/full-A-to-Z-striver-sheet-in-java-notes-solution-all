# Partition Array for Maximum Sum

## Problem and contract

Partition all entries into blocks of length<=k; each entry in a block becomes the block maximum. Maximize total; negatives allowed.

## Approach

For each start i try every allowed first-block endpoint j, track running maximum, and add its length*maximum plus optimal suffix dp[j+1].

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

[1,15,7]->45, [9]->9, [2,5,10]->30, totaling84.

## Complexity

O(n*k) time, O(n) space.

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
84
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

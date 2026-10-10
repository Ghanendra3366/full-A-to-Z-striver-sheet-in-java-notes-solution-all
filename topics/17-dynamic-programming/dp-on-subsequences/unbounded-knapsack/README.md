# Unbounded knapsack

## Problem and contract

Positive integer weights; maximize total value within capacity. Each type can repeat. Empty selection allowed.

## Approach

dp[c]=max(skip,value[i]+dp[c-weight[i]]). Ascending capacities read the current item layer, allowing reuse.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Capacity6: 0/1 takes weights2+3 for value9; unlimited takes three weight2 items for12.

## Complexity

O(n*capacity) time, O(capacity) space.

## Edge cases and Java 8 mistakes

Zero weight with positive value makes unlimited optimum infinite; positive weights are required.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
12
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

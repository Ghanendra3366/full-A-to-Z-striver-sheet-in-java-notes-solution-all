# Frog Jump

## Problem and contract

A frog starts at index zero and jumps 1..k forward indices. Cost is absolute height difference; return minimum total. Frog Jump uses k=2.

## Approach

dp[i]=min over j=1..k of dp[i-j]+abs(h[i]-h[i-j]). Every path has one last jump; minimizing each predecessor is safe by additive cost.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

k=2 permits 0->1->3 at cost 10+10=20; k=3 permits 0->3 at cost zero.

## Complexity

O(n*k) time, O(n) space.

## Edge cases and Java 8 mistakes

Widen height subtraction before abs; extreme int heights are supported.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
20
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

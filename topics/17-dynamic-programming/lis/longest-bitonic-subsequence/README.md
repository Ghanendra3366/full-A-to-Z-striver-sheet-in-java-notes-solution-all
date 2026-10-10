# Longest Bitonic Subsequence

## Problem and contract

A bitonic subsequence strictly increases then strictly decreases; either side may have length one.

## Approach

At every peak i combine LIS ending at i and decreasing sequence starting at i; subtract one because peak is counted twice.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

1,2,10,4,2,1 has six values.

## Complexity

O(n²) time, O(n) space.

## Edge cases and Java 8 mistakes

Some judges require both slopes nonempty; require up[i]>1 and down[i]>1 for that variant.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
6
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Longest Increasing Subsequence

## Problem and contract

Return length of a STRICTLY increasing subsequence, not necessarily contiguous.

## Approach

tails[len-1] is the smallest attainable ending value of a subsequence of length len. Replacing a tail with a smaller value preserves length while helping future extension. Lower bound makes equality replace instead of extend.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Tails evolve toward [2,3,7,18], giving length4.

## Complexity

O(n log n) time, O(n) space.

## Edge cases and Java 8 mistakes

The tails array itself need not correspond to one actual subsequence; reconstruction needs predecessors.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

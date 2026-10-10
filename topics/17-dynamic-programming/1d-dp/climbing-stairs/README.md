# Climbing stairs

## Problem and contract

Reach step n with jumps of one or two; n=0 has one empty way. Return exact count.

## Approach

ways(i)=ways(i-1)+ways(i-2), because final jump is one of those two disjoint cases. Base ways(0)=ways(1)=1. Keep only the two preceding counts.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

ways: 1,1,2,3,5,8 for n=0..5.

## Complexity

O(n) BigInteger additions, O(answer bits) retained storage.

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
8
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

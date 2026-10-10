# Number of Longest Increasing Subsequences

## Problem and contract

Count positional STRICT LISs of maximum length; empty input returns zero.

## Approach

For each endpoint track best length and count. Better predecessor resets count; equal-best predecessor adds count. Finally sum counts at global-best endpoints.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

1,3,5,7 and1,3,4,7 are the two length4 LISs.

## Complexity

O(n²) BigInteger additions; O(n) stored length/count states.

## Edge cases and Java 8 mistakes

Equal values do not extend an increasing sequence but distinct positions can give distinct length1 choices.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

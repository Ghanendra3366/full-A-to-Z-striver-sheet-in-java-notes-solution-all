# Palindrome partitioning

## Problem and contract

Partition the whole string into contiguous palindromic parts; return every partition.

## Approach

For each start, try every palindromic prefix and recursively partition the suffix. Each partition has a unique sequence of end positions.

## Other approaches

Precompute a palindrome table in O(n²) to make each prefix check O(1); output remains exponential.

## Dry run

a -> a -> b gives [a,a,b]; aa -> b gives [aa,b].

## Complexity

O(n²*2^n) safe worst time bound for direct checks/copies; O(n) recursion depth plus output.

## Edge cases and Java 8 mistakes

Empty string has one empty partition. Substring creates new strings in Java 8.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[a, a, b], [aa, b]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

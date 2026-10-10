# Count subarrays with given sum

## Problem and contract

Count all contiguous subarrays whose sum is k; return long.

## Approach

A previous prefix must equal currentPrefix minus k. Add its frequency before inserting current prefix so empty subarrays are excluded. Seed zero with frequency one.

## Other approaches

Two nested loops maintaining a running aggregate give O(n²) time and O(1) auxiliary space.

## Dry run

Repeated compatible prefix values count multiple start positions; they must be stored as counts rather than just presence.

## Complexity

Expected O(n) time and O(n) space.

## Edge cases and Java 8 mistakes

The answer can be n*(n+1)/2, exceeding int. Sum prefixes also need long.

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

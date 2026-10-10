# Majority Element-II

## Problem and contract

Return all values occurring more than floor(n/3) times, sorted. At most two values qualify.

## Approach

Cancel triples of distinct values using two candidate counters. A value exceeding n/3 survives cancellation; recount both survivors to verify.

## Other approaches

HashMap frequency counting is simpler but uses O(n) space.

## Dry run

[1,1,1,2,2,2,3]: candidates 1,2 lose one vote to 3; actual counts both 3>2.

## Complexity

O(n) time; O(1) auxiliary space and at most two outputs.

## Edge cases and Java 8 mistakes

Candidate equality checks must precede empty-slot checks. Recount rather than trusting residual votes.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

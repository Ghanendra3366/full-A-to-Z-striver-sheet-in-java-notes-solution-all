# Majority Element-I

## Problem and contract

Return the value occurring more than floor(n/2) times, or empty if absent.

## Approach

Boyer-Moore cancels pairs of unequal values. A strict majority cannot be entirely cancelled. A second pass verifies the candidate.

## Other approaches

HashMap counting uses expected O(n) time and O(n) space; sorting uses O(n log n) time.

## Dry run

2 gives vote 1, another 2 gives 2, 1 reduces to 1, final 2 gives 2; count is 3>2.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Verification is required unless existence is guaranteed. Empty input returns empty.

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

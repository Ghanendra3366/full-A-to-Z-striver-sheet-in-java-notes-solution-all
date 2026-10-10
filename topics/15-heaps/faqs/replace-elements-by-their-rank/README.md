# Replace Elements by Their Rank

## Problem and contract

Dense ranks start at one; equal values share rank, larger distinct values have larger rank.

## Approach

Sort values, assign a new rank only on the first occurrence of a distinct value, then map original positions.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Distinct order 10,20,30,40 gets ranks 1,2,3,4.

## Complexity

O(n log n) time; O(n) space.

## Edge cases and Java 8 mistakes

Rank is based on distinct values, not original indices. Input remains unchanged.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[4, 1, 2, 3, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

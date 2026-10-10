# Minimum Days to Make Bouquets

## Problem and contract

Make m bouquets using k adjacent, disjoint bloomed flowers each; find earliest day or -1. Bloom days are nonnegative.

## Approach

For a day, count disjoint groups of k within bloomed runs. Later days can only add usable flowers, giving monotone feasibility.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Day 3 blooms positions 0,2,4, enough for three single-flower bouquets.

## Complexity

O(n log dayRange) time; O(1) space.

## Edge cases and Java 8 mistakes

m*k needs long. Breaking adjacency resets the run; do not count merely the total bloomed flowers.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

# Fractional Knapsack

## Problem and contract

Items are [value,positive weight], nonnegative values. Fractions are allowed; maximize value within integer capacity.

## Approach

Sort by value per weight. An exchange of equal weight from a lower-density portion to a higher-density portion never decreases value, so consume densities in descending order.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Take 10 weight for 60, 20 for 100, then 20/30 of 120 for 80; total 240.

## Complexity

O(n log n) time; O(n) copy space.

## Edge cases and Java 8 mistakes

This greedy proof relies on divisible items. The 0/1 version requires a different algorithm.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
240.0
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

# Counting Frequencies of Array Elements

## Problem and contract

Return sorted value-to-frequency counts.

## Approach

Increment one count per entry; after processing each prefix the map equals its exact histogram.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

10 occurs3,5 occurs2,15 occurs1.

## Complexity

O(n log u) time, O(u) space; TreeMap provides deterministic sorted keys.

## Edge cases and Java 8 mistakes

A HashMap alternative gives expected O(n) time but unspecified iteration order.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
{5=2, 10=3, 15=1}
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Highest Occurring Element in an Array

## Problem and contract

Return the most frequent value; ties choose the smaller value.

## Approach

TreeMap visits keys in increasing order. Update only for a strictly higher frequency, so the first value among ties wins.

## Other approaches

HashMap gives expected O(n) counting, but then compare both frequency and value explicitly.

## Dry run

Counts: 1->1, 2->2, 3->2. Value 2 beats 1; 3 ties and is skipped.

## Complexity

O(n log u) time and O(u) space, u distinct values.

## Edge cases and Java 8 mistakes

Tie-breaking must be explicit. Empty arrays have no most frequent element.

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

[Curriculum index](../../../../COVERAGE.md)

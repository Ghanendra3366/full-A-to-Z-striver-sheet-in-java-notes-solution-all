# Number of Greater Elements to the Right

## Problem and contract

For each index count ALL strictly greater values to its right, not just the next greater.

## Approach

Scan right-to-left, storing seen counts in a Fenwick tree over compressed ranks. Greater count is total seen minus count at ranks<=current.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For 3, values 4 and 7 are greater; for 4 only 7; for 2 only 7.

## Complexity

O(n log n) time, O(n) space, including sorted copy and Fenwick tree.

## Edge cases and Java 8 mistakes

Strictly greater excludes equal ranks. Coordinate lookup uses lower bound, so duplicates do not cause a linear rank-search scan.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[2, 1, 1, 0]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

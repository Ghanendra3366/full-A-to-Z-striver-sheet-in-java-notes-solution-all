# Top View of BT

## Problem and contract

Return one visible value per column from left to right. Bottom-view equal-depth ties choose the later BFS node.

## Approach

BFS visits shallow nodes first. Retain the first per column for the shallowest. TreeMap emits columns in ascending order.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Column zero has 4 first, then 3 and 5; top retains 4, bottom retains 5.

## Complexity

O(n log n) time and O(n) space.

## Edge cases and Java 8 mistakes

Tie rules vary by platform; bottom here uses later left-to-right BFS order.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 4, 6, 7]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

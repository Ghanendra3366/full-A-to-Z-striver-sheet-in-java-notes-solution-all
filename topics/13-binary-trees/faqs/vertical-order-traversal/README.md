# Vertical Order Traversal

## Problem and contract

Group by horizontal column; within a column sort by depth, then value for same depth.

## Approach

Assign coordinates root(0,0), left(-1,+1), right(+1,+1). Sort the coordinate records by the exact tie rules and group equal columns.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Column zero contains 4 at depth 0 and values 3,5 at depth 2.

## Complexity

O(n log n) time and O(n) space.

## Edge cases and Java 8 mistakes

BFS order alone is insufficient when same-coordinate ties require numeric order.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[1], [2], [4, 3, 5], [6], [7]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

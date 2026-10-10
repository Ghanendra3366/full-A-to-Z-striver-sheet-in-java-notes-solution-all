# Count total nodes in a complete BT

## Problem and contract

Count nodes in a COMPLETE binary tree; incomplete arbitrary trees violate this shortcut's contract.

## Approach

In a complete subtree, equal leftmost/rightmost heights prove it is perfect, with 2^height-1 nodes. Otherwise recurse; at least one side is perfect at each level.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sample extreme heights both three, so 2³-1=7.

## Complexity

O(log² n) time; O(log n) stack on complete trees.

## Edge cases and Java 8 mistakes

Equal extreme heights alone do not prove perfection for arbitrary trees; completeness is essential. Shift overflow is explicitly rejected.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
7
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

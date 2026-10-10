# Print root to leaf path in BT

## Problem and contract

Return all full root-to-leaf paths, left-first.

## Approach

DFS appends current value; copy at a leaf, recurse otherwise, then remove current before returning.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Path 4,2 branches into leaves 1 and 3; after backtracking 4,6 branches into 5 and 7.

## Complexity

O(n+total emitted path lengths) time; O(h) working state plus output.

## Edge cases and Java 8 mistakes

A leaf has neither child. Copy paths rather than storing the shared mutable builder.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[4, 2, 1], [4, 2, 3], [4, 6, 5], [4, 6, 7]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

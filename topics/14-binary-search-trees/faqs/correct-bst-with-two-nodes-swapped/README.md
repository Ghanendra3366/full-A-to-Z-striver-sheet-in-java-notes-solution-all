# Correct BST with two nodes swapped

## Problem and contract

Restore a strict BST whose values in exactly two nodes were swapped. Already-valid input is left unchanged.

## Approach

In inorder, swapped values create one or two descents. Record the previous node at the first descent and the current node at the last descent, then swap them.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Swap 2 and 6: inorder becomes 1,6,3,4,5,2,7; descents identify 6 and 2.

## Complexity

O(n) time; O(h) stack.

## Edge cases and Java 8 mistakes

This fixes exactly a two-value swap; it is not a general arbitrary-tree BST repair.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3, 4, 5, 6, 7]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

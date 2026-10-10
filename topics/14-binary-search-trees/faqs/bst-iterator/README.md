# BST iterator

## Problem and contract

An ascending (or descending with reverse=true) lazy BST iterator; next requires hasNext.

## Approach

Stack contains the path to the next unvisited inorder node. Pop that node and push the opposite subtree's boundary path.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Initially stack is 4,2,1 with 1 on top; pop 1, then 2 pushes 3.

## Complexity

O(h) storage, O(h) worst per next but O(1) amortized over a full traversal; O(h) initialization.

## Edge cases and Java 8 mistakes

Modifying the tree during iteration invalidates the traversal invariant.

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

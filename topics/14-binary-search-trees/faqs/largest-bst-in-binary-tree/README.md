# Largest BST in Binary Tree

## Problem and contract

Return the number of nodes in the largest rooted subtree that is a strict BST.

## Approach

Postorder returns valid flag, subtree size, minimum, maximum and largest BST size. A root forms a BST iff both children are BSTs and their extrema bracket its key.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Each leaf is a BST size 1; children 2 and 6 each build size 3; root 4 builds size 7.

## Complexity

O(n) time, O(h) stack.

## Edge cases and Java 8 mistakes

The answer must be a whole rooted subtree, not an arbitrary node subset. Long sentinels preserve extreme int keys.

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

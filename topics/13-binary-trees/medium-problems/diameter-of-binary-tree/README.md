# Diameter of Binary Tree

## Problem and contract

Return the longest path length in EDGES between any two nodes.

## Approach

A longest path has a highest node where its left and right downward paths meet. For each root, child heights sum to its through-root edge count; maximize globally.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Leaf 1 ->2->4->6->7 has four edges.

## Complexity

O(n) time, O(h) stack.

## Edge cases and Java 8 mistakes

A diameter need not pass through the global root. Singleton diameter is zero.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

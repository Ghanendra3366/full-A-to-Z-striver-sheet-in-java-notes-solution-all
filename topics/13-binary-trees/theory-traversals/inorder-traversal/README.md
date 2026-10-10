# Inorder Traversal

## Problem and contract

Return values in inorder traversal.

## Approach

Recurse on both children, visiting the root in the position defined by this traversal. Each subtree is visited exactly once.

## Other approaches

Iterative stacks avoid recursive frames but still require O(h) working storage.

## Dry run

For root 4 with children 2,6, the position of 4 relative to both child traversals distinguishes the three orders.

## Complexity

O(n) time, O(h) stack plus O(n) output.

## Edge cases and Java 8 mistakes

Null produces an empty output; values need not be unique. A deep chain can exhaust the call stack.

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

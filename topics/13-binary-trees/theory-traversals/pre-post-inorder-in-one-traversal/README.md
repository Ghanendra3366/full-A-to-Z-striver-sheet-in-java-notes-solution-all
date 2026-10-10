# Pre, Post, Inorder in one traversal

## Problem and contract

Return [preorder,inorder,postorder] from a single recursive walk.

## Approach

Record a root at entry, between children, and at exit respectively. These are the three natural phases of a depth-first call.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

At root 4: pre records 4 before left, in after left, post after right.

## Complexity

O(n) time and output, O(h) stack.

## Edge cases and Java 8 mistakes

The returned order of the three lists is explicit and may differ from another platform's API.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[4, 2, 1, 3, 6, 5, 7], [1, 2, 3, 4, 5, 6, 7], [1, 3, 2, 5, 7, 6, 4]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

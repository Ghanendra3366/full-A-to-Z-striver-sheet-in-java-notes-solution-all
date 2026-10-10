# Morris Preorder Traversal

## Problem and contract

Traverse with O(1) auxiliary state by temporarily threading pointers; original links are restored on normal completion.

## Approach

For a left subtree, thread its rightmost node back to root. First encounter creates the thread and descends; second removes it. Preorder records root on first encounter.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

At 4, temporarily set 3.right=4; after traversing 2, remove that thread and continue to 6.

## Complexity

O(n) amortized time, O(1) auxiliary space excluding O(n) result.

## Edge cases and Java 8 mistakes

Do not stop early or throw while threads remain; that would corrupt the tree. Concurrent traversal is unsafe during threading.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[4, 2, 1, 3, 6, 5, 7]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

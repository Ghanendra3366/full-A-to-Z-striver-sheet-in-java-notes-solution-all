# LCA in BST

## Problem and contract

Operate on a strict BST with distinct int keys. OptionalInt represents missing bounds; node-returning operations mutate links and return the new root.

## Approach

Assuming both keys exist, their lowest common ancestor is the first root where their search paths split or one key equals the root.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sample BST: root 4; children 2,6; leaves 1,3,5,7. Trace comparisons from root until equality or a null boundary.

## Complexity

O(h) time; O(1) auxiliary state for iterative searches, O(h) stack for recursive insertion. h can be n.

## Edge cases and Java 8 mistakes

The tree must satisfy the whole BST invariant. The LCA method requires both keys present. Do not assume h=log n without balance.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

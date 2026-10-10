# Flatten Binary Tree to Linked List

## Problem and contract

Flatten in place into preorder order along right links; every left becomes null.

## Approach

Splice each left subtree before the current right subtree, attaching old right to its rightmost boundary. This preserves root-left-right visitation.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Root 4 places left subtree 2 before 6; node 2 places 1 before 3; final right chain is preorder.

## Complexity

O(n) amortized time; O(1) space.

## Edge cases and Java 8 mistakes

The original shape is destroyed. Returned chain reuses existing node identities.

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

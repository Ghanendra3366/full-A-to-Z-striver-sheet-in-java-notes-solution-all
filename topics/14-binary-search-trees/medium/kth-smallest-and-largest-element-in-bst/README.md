# Kth Smallest and Largest element in BST

## Problem and contract

Return ONE-based kth smallest and kth largest values, requiring 1<=k<=node count.

## Approach

Inorder gives all keys sorted. Select k-1 from the front and k from the end.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sorted sample 1..7 gives second smallest 2 and second largest 6.

## Complexity

O(n) time/space including inorder recursion.

## Edge cases and Java 8 mistakes

A stack iterator can stop early in O(h+k) time and O(h) space. Augment subtree sizes for repeated rank queries.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[2, 6]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

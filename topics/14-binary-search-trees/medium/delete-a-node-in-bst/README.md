# Delete a node in BST

## Problem and contract

Delete key x if present, returning the possibly changed root.

## Approach

Zero/one-child deletion replaces root with its child. With two children, copy the smallest right-subtree value and delete that successor; it fits between every left and remaining right key.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Delete 4: successor 5 replaces root, then the former leaf 5 is removed from the right subtree.

## Complexity

O(h) time/stack.

## Edge cases and Java 8 mistakes

This deletes by key while retaining the root object in the two-child case; external references may observe its changed value.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3, 5, 6, 7]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

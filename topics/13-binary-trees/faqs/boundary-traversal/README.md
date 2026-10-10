# Boundary Traversal

## Problem and contract

Anticlockwise boundary: root, left boundary excluding leaves, leaves left-to-right, reversed right boundary excluding leaves.

## Approach

Collect each role separately. Excluding leaves from boundaries prevents duplication; root is omitted initially if it is itself a leaf.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sample: root 4; left boundary 2; leaves 1,3,5,7; reversed right boundary 6.

## Complexity

O(n) time/output, O(h) recursion/boundary space.

## Edge cases and Java 8 mistakes

For missing left/right children use the available child while following a boundary.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[4, 2, 1, 3, 5, 7, 6]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

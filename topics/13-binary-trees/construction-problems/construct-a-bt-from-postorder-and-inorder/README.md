# Construct a BT from Postorder and Inorder

## Problem and contract

Construct using distinct labels, supplied traversal order then inorder. Reject inconsistent intervals and lengths.

## Approach

Root is at the beginning of preorder or end of postorder. Look up its inorder position to determine left size and recurse on corresponding half-open ranges.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For inorder 1,2,3, root 2 divides leaf 1 from leaf 3.

## Complexity

Expected O(n) time with index map; O(n) map/output plus O(h) stack.

## Edge cases and Java 8 mistakes

Duplicates are explicitly unsupported. Repeated linear inorder scans would cost O(n²) in a skewed case.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

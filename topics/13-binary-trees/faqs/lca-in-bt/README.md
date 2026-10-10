# LCA in BT

## Problem and contract

Find lowest common ancestor by NODE identity; both query nodes must exist in the tree.

## Approach

A subtree returns a found query or its LCA. If both children return nonnull, current root is the first meeting point; otherwise propagate the single found side.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Queries nodes 1 and 3 lie in opposite children of node 2, so LCA is 2.

## Complexity

O(n) time; O(h) stack.

## Edge cases and Java 8 mistakes

Equal values do not imply the same node. If either node may be absent, validate membership first; this kernel assumes presence.

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

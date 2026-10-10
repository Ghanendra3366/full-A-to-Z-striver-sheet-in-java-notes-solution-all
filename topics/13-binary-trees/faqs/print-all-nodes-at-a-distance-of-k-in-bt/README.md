# Print all nodes at a distance of K in BT

## Problem and contract

Return values exactly k edges from a given target node; target must be in the tree.

## Approach

Map parent links, then BFS from target using left,right,parent as graph neighbors. Identity-based seen prevents walking back and forth; layer k is distance k.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

From node 2: layer 0 [2], layer 1 [1,3,4], layer 2 [6].

## Complexity

O(n) time/space (this teaching helper computes all layers).

## Edge cases and Java 8 mistakes

An optimized distance-k BFS can stop after k layers. Equal values remain separate node identities.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[6]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

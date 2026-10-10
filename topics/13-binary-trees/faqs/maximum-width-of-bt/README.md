# Maximum Width of BT

## Problem and contract

Width includes missing positions between leftmost/rightmost existing nodes at a level; return exact BigInteger.

## Approach

Assign conceptual complete-tree indices. Normalize each level by its first index, preserving differences. Width is last normalized index+1. BigInteger avoids exponential-gap overflow.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Full sample last level has indices 0,1,2,3, width four.

## Complexity

O(n) index operations plus index bit costs; O(maxWidthInNodes) queue storage.

## Edge cases and Java 8 mistakes

Count of actual level nodes differs from indexed width on sparse trees. Even normalization alone cannot prevent long overflow for very wide sparse gaps.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

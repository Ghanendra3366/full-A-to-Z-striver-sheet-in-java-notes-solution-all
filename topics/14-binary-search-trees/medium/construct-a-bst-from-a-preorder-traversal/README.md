# Construct a BST from a preorder traversal

## Problem and contract

Build a strict BST from its preorder, rejecting invalid sequences or duplicates.

## Approach

Consume the next preorder key only when inside the current bounds. After root, build left then right with tightened bounds. Each valid key is consumed once.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

4 becomes root; 2,1,3 fill left; 6,5,7 fill right.

## Complexity

O(n) time, O(h) stack and O(n) output nodes.

## Edge cases and Java 8 mistakes

Checking only an upper bound can accept some malformed input sequences; both bounds and final consumption validation are used.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3, 4, 5, 6, 7]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Children Sum Property in Binary Tree

## Problem and contract

Check whether each nonleaf value equals its children's values, with missing child zero.

## Approach

Test local equality and recursively require it at all descendants. This lesson checks the property; it does not increase values to enforce it.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sample tree has three levels; its unequal mirrored values and root 4 != 2+6 make symmetry/children-sum checks false.

## Complexity

O(n) time, O(h) recursion space.

## Edge cases and Java 8 mistakes

Be explicit about checking versus modifying the children-sum property. An empty tree passes boolean structural checks.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
false
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

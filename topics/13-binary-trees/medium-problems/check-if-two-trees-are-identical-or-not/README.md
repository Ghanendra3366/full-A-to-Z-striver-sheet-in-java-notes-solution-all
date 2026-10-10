# Check if two trees are identical or not

## Problem and contract

Check equal structure and values.

## Approach

Both null matches; one null fails; otherwise roots and both corresponding subtrees must match.

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
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Check for symmetrical BTs

## Problem and contract

Check mirror symmetry of structure AND values about the root.

## Approach

Compare the left child of one side with the right child of the other.

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

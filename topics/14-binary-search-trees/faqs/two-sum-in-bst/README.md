# Two sum in BST

## Problem and contract

Find two distinct nodes in a strict BST whose values sum to target.

## Approach

Use ascending and descending iterators like two pointers on sorted values. Move the lower endpoint when sum is low and the upper when high. Stop when node identities meet.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1+7=8<9, advance low to 2; 2+7=9 succeeds.

## Complexity

O(n) worst time and O(h) auxiliary stack space.

## Edge cases and Java 8 mistakes

Compare identities, not values, for distinct-node stopping; strict distinct keys are assumed. Use long sum.

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

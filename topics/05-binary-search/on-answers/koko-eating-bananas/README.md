# Koko Eating Bananas

## Problem and contract

Each nonempty pile consumes ceil(pile/speed) whole hours. Find smallest integer speed within hours, or -1 when impossible.

## Approach

Feasibility is monotone: faster never needs more time. Binary search the first feasible speed between 1 and largest pile.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Speed 4 requires 1+2+2+3=8; speed 3 requires 1+2+3+4=10.

## Complexity

O(n log maxPile) time; O(1) space.

## Edge cases and Java 8 mistakes

Use long for ceiling arithmetic and totals. One hour per nonempty pile is a necessary lower bound.

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

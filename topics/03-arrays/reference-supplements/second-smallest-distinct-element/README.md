# Second Smallest Distinct Element

## Problem and contract

Return the second DISTINCT minimum, absent if fewer than two distinct values.

## Approach

Maintain the smallest two distinct processed values. A new minimum demotes the old one; a strictly intermediate value changes only second.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

4 becomes first;1 demotes4; duplicate1 does nothing;2 replaces second4.

## Complexity

O(n) time, O(1) space.

## Edge cases and Java 8 mistakes

OptionalInt supports every int value without a sentinel collision.

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

# Largest Element

## Problem and contract

Return the maximum of a nonempty array.

## Approach

Initialize from a real entry, then maintain the largest processed value.

## Other approaches

Sorting takes O(n log n) and may mutate input unnecessarily.

## Dry run

-5 -> max(-5,-2)=-2 -> max(-2,-9)=-2.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Starting best at zero is wrong for all-negative inputs.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
-2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Enforce Children Sum Property

## Problem and contract

Increase nonnegative int values only until each nonleaf equals its child-value sum. Shape is preserved; no minimum-total-increase guarantee.

## Approach

If children already sum above root, raise root. Otherwise raise an existing child to root so recursion can propagate the deficit. After fixing children, assign their final sum back to root; all changes are nondecreasing.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sample left root2 rises to1+3=4; right6 to5+7=12; global root becomes4+12=16.

## Complexity

O(n) time, O(h) stack.

## Edge cases and Java 8 mistakes

Math.addExact throws if a resulting sum exceeds int; an overflow exception can occur after earlier mutations. The separate Children Sum Property lesson CHECKS without modifying values.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
16 4 12
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

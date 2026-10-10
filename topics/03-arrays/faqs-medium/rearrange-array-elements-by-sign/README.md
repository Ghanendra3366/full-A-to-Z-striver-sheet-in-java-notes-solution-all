# Rearrange array elements by sign

## Problem and contract

Stable alternate nonnegative and negative values, starting nonnegative. If counts differ, append the remaining values. Return a new array.

## Approach

Split into stable sign lists, then weave them. Each sign list preserves its original relative order.

## Other approaches

With exactly equal counts and no zero, write positives to even positions and negatives to odd positions in one pass.

## Dry run

pos=[3,1,2], neg=[-2,-5,-4]; weave the corresponding fronts.

## Complexity

O(n) time and O(n) space.

## Edge cases and Java 8 mistakes

Zero is classified as nonnegative. Equal sign counts are not required.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3, -2, 1, -5, 2, -4]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

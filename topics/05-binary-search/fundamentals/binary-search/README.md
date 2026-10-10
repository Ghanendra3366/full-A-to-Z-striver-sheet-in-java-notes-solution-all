# Binary Search

## Problem and contract

Find any occurrence of x in a nondecreasing array, returning index or -1.

## Approach

Comparison with the middle discards a half that cannot contain x. The interval length strictly decreases.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

mid 1 is 3<5, search [2,3]; mid 2 matches.

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

Use l+(r-l)/2 to avoid addition overflow. A duplicate result need not be first.

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

[Curriculum index](../../../../COVERAGE.md)

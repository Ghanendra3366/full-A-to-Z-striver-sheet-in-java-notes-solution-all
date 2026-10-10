# Binary Subarrays With Sum

## Problem and contract

Count subarrays of binary values with sum exactly goal>=0.

## Approach

Because values are nonnegative, all suffixes of a valid at-most window are valid. Subtract atMost(goal-1) from atMost(goal).

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

The four matches are indices [0,2],[0,3],[1,4],[2,4].

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Arbitrary signed values require prefix-sum hashing; this window kernel is only for nonnegative input. Zeros produce many equal-sum windows.

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

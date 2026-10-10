# Aggressive Cows

## Problem and contract

Choose cows stall positions maximizing their minimum pairwise distance. Require 2<=cows<=stall count.

## Approach

Sort stalls. For a candidate distance place each next cow at the earliest possible stall; choosing earlier cannot reduce future options. Search the last feasible distance.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sorted 1,2,4,8,9: distance 3 permits 1,4,8; distance 4 permits only 1,8.

## Complexity

O(n log n+n log coordinateRange) time; O(n) copy space.

## Edge cases and Java 8 mistakes

Use long coordinate differences for negative and extreme int coordinates. One cow has no pairwise minimum, so it is rejected.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

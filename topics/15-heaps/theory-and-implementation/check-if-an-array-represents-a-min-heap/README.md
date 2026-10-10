# Check if an array represents a min heap

## Problem and contract

Check min-heap order on a complete array representation.

## Approach

Every nonroot node must be no smaller than its parent. This local relation along paths makes the root a global minimum.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1<=3,1<=2,3<=5, so all parent-child comparisons pass.

## Complexity

O(n) time, O(1) space.

## Edge cases and Java 8 mistakes

Sortedness is sufficient but not necessary for heap order. Empty/singleton arrays are heaps.

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

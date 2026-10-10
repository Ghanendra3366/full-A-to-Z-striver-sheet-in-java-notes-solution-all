# Allocate Books

## Problem and contract

Partition nonnegative ordered weights/pages/lengths into exactly parts nonempty contiguous groups; minimize the largest group sum. Return long.

## Approach

Given a candidate maximum, greedily fill each group until the next item would exceed it. This uses the fewest groups for that maximum. Feasibility becomes true monotonically as the maximum increases.

## Other approaches

Enumerating every cut placement is exponential. DP over position and number of groups is O(parts*n²).

## Dry run

At capacity 18, groups [7,2,5] sum 14 and [10,8] sum 18. Capacity 17 needs three groups.

## Complexity

O(n log(sum-max+1)) time; O(1) space.

## Edge cases and Java 8 mistakes

No reordering or splitting individual items. Books rejects more students than books. Painter time multipliers belong outside this common partition kernel. Negative values violate greedy monotonicity.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
18
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

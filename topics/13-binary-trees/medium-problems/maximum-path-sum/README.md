# Maximum path sum

## Problem and contract

Return maximum sum of a NONEMPTY simple path in a nonempty binary tree.

## Approach

Negative child gains can be omitted. Update the complete path using both sides, but return only one side because a parent cannot extend a fork.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

3->2->4->6->7 sums 22 in the sample.

## Complexity

O(n) time, O(h) stack.

## Edge cases and Java 8 mistakes

Initialize global best to -infinity for all-negative trees, and use long sums.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
22
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

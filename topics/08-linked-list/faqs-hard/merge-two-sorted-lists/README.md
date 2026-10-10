# Merge two Sorted Lists

## Problem and contract

Merge two disjoint sorted acyclic chains by relinking their nodes.

## Approach

Repeatedly take the smaller head. It is the smallest remaining value globally; append the surviving suffix when one chain ends.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Take 1, then 2, then 3, then append 4.

## Complexity

O(n+m) time; O(1) auxiliary space.

## Edge cases and Java 8 mistakes

Inputs must not share nodes, or relinking can create cycles. Equality takes from the first list, preserving stable order.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3, 4]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

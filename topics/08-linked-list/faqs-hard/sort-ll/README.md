# Sort LL

## Problem and contract

Stable nondecreasing linked-list sort by relinking nodes.

## Approach

Split the chain at its midpoint, disconnect halves, recursively sort, then merge. Split makes progress even for two nodes because fast starts at h.next.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

4,2 | 1,3 -> 2,4 | 1,3 -> 1,2,3,4.

## Complexity

O(n log n) time; O(log n) recursion stack.

## Edge cases and Java 8 mistakes

Forgetting to disconnect slow.next prevents the subproblem from shrinking. Singly next links are maintained.

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

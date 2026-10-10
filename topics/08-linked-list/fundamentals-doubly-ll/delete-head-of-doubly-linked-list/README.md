# Delete head of Doubly Linked List

## Problem and contract

Perform the named operation on a doubly linked list; kth positions are ONE-based. Given-node parameters must actually belong to the list. Return and retain the new head.

## Approach

Maintain the invariant p.next.prev==p wherever p.next exists, and p.prev.next==p wherever p.prev exists. Head.prev is null and tail.next is null. Inserting links both neighbors to the new node; deleting reconnects both neighbors and detaches the removed node. Reversal swaps both links at every node.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Draw the demo chain with arrows in both directions. Apply the splice or swap shown in solve; confirm both forward and backward adjacency after each operation.

## Complexity

O(n) when traversal/conversion/deduplication is needed; O(1) for a known-node splice or head operation. Conversion allocates O(n) output nodes; other operations use O(1) auxiliary state.

## Edge cases and Java 8 mistakes

Updating only next produces a broken doubly list. Null, singleton and head/tail cases need explicit handling. Duplicate removal requires sorted input.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[2, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

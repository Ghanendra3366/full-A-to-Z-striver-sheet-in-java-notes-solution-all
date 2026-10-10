# Flattening of LL

## Problem and contract

Heads linked by next each own a sorted bottom chain. Merge into one sorted bottom chain, clearing next links.

## Approach

Recursively flatten the head suffix, then merge its bottom chain with the current one. The sorted-chain merge invariant preserves global order.

## Other approaches

A min-heap over k chain fronts gives O(N log k) time/O(k) auxiliary space.

## Dry run

Bottom chains 1->3 and 2->4 merge into 1->2->3->4.

## Complexity

O(N*k) worst time for N total nodes in k columns; O(k) recursion stack.

## Edge cases and Java 8 mistakes

This multi-level sorted bottom representation differs from depth-first flattening of a doubly list. Node identities are reused.

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

[Curriculum index](../../../../curriculum/COVERAGE.md)

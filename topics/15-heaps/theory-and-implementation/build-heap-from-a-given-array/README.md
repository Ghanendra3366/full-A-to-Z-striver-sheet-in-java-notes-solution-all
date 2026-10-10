# Build heap from a given Array

## Problem and contract

Build a min heap in place. down(a,i,n,min) is also reusable when both child subtrees are already heaps.

## Approach

Visit internal nodes bottom-up. Sift each violating node toward the smaller/larger child until its subtree obeys heap order; child subtrees were already fixed.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

At root 3 of [3,1,2], min-heap down swaps with 1, giving [1,3,2].

## Complexity

O(n) build time, O(log n) per sift-down, O(1) auxiliary space.

## Edge cases and Java 8 mistakes

A heap array is not fully sorted. Calling down only at root does not fix arbitrary unsorted children.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 3, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

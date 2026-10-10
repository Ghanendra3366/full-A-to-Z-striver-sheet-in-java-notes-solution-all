# Heap Sort

## Problem and contract

Sort ascending in place with a max heap.

## Approach

Swap the maximum root to the last active position, shrink the active heap, and restore root order. Settled suffix is sorted and never revisited.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Heap [4,2,3,1] puts 4 last, then 3,2,1 settle in sequence.

## Complexity

O(n log n) time; O(1) space; not stable.

## Edge cases and Java 8 mistakes

Pass the active prefix length to down; including the sorted suffix would undo progress.

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

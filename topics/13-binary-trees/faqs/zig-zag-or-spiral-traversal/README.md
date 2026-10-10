# Zig Zag or Spiral Traversal

## Problem and contract

Return level order alternating left-to-right then right-to-left.

## Approach

Compute level groups with BFS, then reverse odd-indexed levels. Reversal changes ordering only, preserving depth membership.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Level 0 [4], reverse level 1 to [6,2], level 2 stays [1,3,5,7].

## Complexity

O(n) time/output, O(maxWidth) queue.

## Edge cases and Java 8 mistakes

Do not reverse child enqueue order without a carefully matched traversal invariant.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[4], [6, 2], [1, 3, 5, 7]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Level Order Traversal

## Problem and contract

Return values grouped by depth, left-to-right.

## Approach

Capture queue size before processing a level. Children enter the queue for the next level; the captured bound prevents mixing levels.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Queue starts [4], then [2,6], then [1,3,5,7].

## Complexity

O(n) time/output, O(maxWidth) queue space.

## Edge cases and Java 8 mistakes

ArrayDeque forbids null; enqueue only existing children.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[4], [2, 6], [1, 3, 5, 7]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

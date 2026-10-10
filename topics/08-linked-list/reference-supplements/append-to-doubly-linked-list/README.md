# Append to Doubly Linked List

## Problem and contract

Append one new value, preserving both next and prev links.

## Approach

Locate tail, connect tail.next to new node and new.prev to tail; empty input becomes the new node.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1<->2 becomes1<->2<->3;3.prev points to2.

## Complexity

O(n) traversal time, O(1) auxiliary space plus one new node.

## Edge cases and Java 8 mistakes

Maintaining a separate tail field would make repeated append O(1). Head-only API scans each time.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3]
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Depth First Search of a Graph

## Problem and contract

Return DFS discovery order covering all components in vertex order.

## Approach

Mark on entry and recursively finish each unvisited neighbor before considering the next. Restart at every unvisited vertex to include disconnected components.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

0 visits1 then3, returns to0, then visits2.

## Complexity

O(V+E) time/space, O(V) worst call stack.

## Edge cases and Java 8 mistakes

Order depends on edge insertion order. For huge graphs replace recursion with an explicit stack.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 1, 3, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

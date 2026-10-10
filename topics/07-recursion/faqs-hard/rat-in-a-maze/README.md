# Rat in a Maze

## Problem and contract

Return all simple open-cell paths in a square binary maze, top-left to bottom-right; directions D,L,R,U.

## Approach

DFS marks only the current path. Explore directions in lexical order and restore visits so distinct paths remain possible.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For [[1,0],[1,1]], only down then right reaches the destination.

## Complexity

Exponential path enumeration, O(4^(n²)) loose upper bound; O(n²) working space plus output.

## Edge cases and Java 8 mistakes

A blocked endpoint yields empty. A 1x1 open maze has one empty path, whose list prints ambiguously as [].

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[DR]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

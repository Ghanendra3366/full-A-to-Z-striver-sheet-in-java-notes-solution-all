# M Coloring Problem

## Problem and contract

Decide whether an undirected adjacency-matrix graph can be properly colored with at most m colors.

## Approach

Choose a color for the next vertex only if no neighbor already has it. Recursively complete later vertices; restore failed choices. Every possible valid assignment is explored.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

A triangle needs three different colors; two cannot suffice.

## Complexity

O(V*m^V) loose time upper bound; O(V) colors/stack excluding input.

## Edge cases and Java 8 mistakes

A self-loop makes proper coloring impossible. Empty graph is colorable with zero colors.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

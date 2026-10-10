# Making a large island

## Problem and contract

Flip at most one zero to one; maximize four-connected island CELLS in a rectangular binary grid.

## Approach

Union existing land, then each possible zero flip joins its DISTINCT adjacent component roots plus one cell. Also retain existing maximum for all-land input.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C*alpha(R*C)) time; O(R*C) space.

## Edge cases and Java 8 mistakes

Two neighboring cells from the same component must not be counted twice; use a root set. All-water returns one; all-land returns its area.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

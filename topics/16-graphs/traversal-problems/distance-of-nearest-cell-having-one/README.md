# Distance of nearest cell having one

## Problem and contract

For every grid cell return Manhattan shortest distance to any one; -1 if no ones.

## Approach

Multi-source BFS starts every one at distance zero; first discovery of each cell is its shortest distance from the nearest source.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C) time/space.

## Edge cases and Java 8 mistakes

Use zero-based vertices, validate input shape at the call site, and restart traversals for disconnected components where required.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[2, 1, 2], [1, 0, 1]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Flood fill algorithm

## Problem and contract

Recolor the four-connected component containing (r,c), in place.

## Approach

Only visit cells of the original color, changing them immediately to mark visited. If new==old return without recursion.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C) worst time/stack.

## Edge cases and Java 8 mistakes

Returning early when old==new prevents infinite recursion caused by ineffective marking.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[2, 2, 0], [2, 0, 0]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

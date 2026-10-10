# Number of Islands with Eight Directions

## Problem and contract

Count eight-connected islands, allowing diagonal adjacency; preserve input.

## Approach

Flood fill each discovered land component using all eight neighbor offsets. Mark before recursing to avoid revisiting cycles.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Diagonal ones at(0,0),(1,1) form one island here, but two in the four-direction lesson.

## Complexity

O(R*C) time/space including copy and stack.

## Edge cases and Java 8 mistakes

Use the connectivity convention from the actual problem statement; both common variants are now executable.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

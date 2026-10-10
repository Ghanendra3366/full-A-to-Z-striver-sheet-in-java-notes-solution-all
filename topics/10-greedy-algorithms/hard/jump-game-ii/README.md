# Jump Game II

## Problem and contract

Return the minimum jumps to the last index or -1 if unreachable, with nonnegative max jump lengths.

## Approach

Process reachable indices in BFS-like layers. end is the boundary reachable with current jumps; far is the next layer frontier. Cross each layer boundary once.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

First layer from index 0 reaches 2; scanning indices 1,2 extends next frontier to 4, requiring two jumps.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Do not increment jumps for each frontier increase. Zero-length progress at a layer boundary means unreachable.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

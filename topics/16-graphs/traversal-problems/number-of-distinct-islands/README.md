# Number of distinct islands

## Problem and contract

Count four-connected island shapes up to TRANSLATION only; rotation/reflection remain different.

## Approach

Represent every island by its cell offsets from its first scan cell. Sort offsets for a traversal-independent canonical key; equal offset sets mean translated identical shapes.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(N log N) worst time, O(N) space for N cells.

## Edge cases and Java 8 mistakes

String coordinates use a delimiter and sorted complete sets; do not use ambiguous concatenated numeric keys.

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

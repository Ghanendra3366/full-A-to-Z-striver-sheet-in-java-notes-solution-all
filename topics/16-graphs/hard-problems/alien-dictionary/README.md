# Alien Dictionary

## Problem and contract

Words are sorted under an unknown alphabet a..(a+alphabet-1). Return one valid character order, empty if invalid.

## Approach

Only the first differing character of adjacent words yields a precedence edge. Reject a longer word preceding its own prefix, then topologically sort the character graph.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(total compared characters+K²) small-alphabet bound; O(K²) graph storage.

## Edge cases and Java 8 mistakes

Absent alphabet letters still appear in the returned order. Other valid orders may exist.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
bdac
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

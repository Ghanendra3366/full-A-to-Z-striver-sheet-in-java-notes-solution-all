# Most stones removed with same row or column

## Problem and contract

Remove a stone only while another shares its row or column; maximize removals. Coordinates are unique pairs.

## Approach

Union stone indices via a representative for each row and column. Each connected component can remove all but one using a spanning-tree leaf order; at least one must remain.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

Expected O(N alpha(N)) time; O(N) space.

## Edge cases and Java 8 mistakes

Rows and columns have separate maps, so identical numeric row/column values are not accidentally identified.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

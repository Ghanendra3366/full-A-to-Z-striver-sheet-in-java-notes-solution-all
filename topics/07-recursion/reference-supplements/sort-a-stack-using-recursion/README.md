# Sort a Stack Using Recursion

## Problem and contract

Sort stack descending from top to bottom, using front as top.

## Approach

Recursively sort the remaining stack; insert the removed top by recursively moving larger entries aside until its proper position, then restore them.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sort1,3,2 into3,2,1; insert4 at the top.

## Complexity

O(n²) time, O(n) peak recursion depth.

## Edge cases and Java 8 mistakes

Equal values are allowed. Iterative collection sorting is simpler when recursion is not an exercise requirement.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[4, 3, 2, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

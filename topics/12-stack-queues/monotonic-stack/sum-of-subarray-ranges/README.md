# Sum of Subarray Ranges

## Problem and contract

Sum max-min of every nonempty subarray, assuming total fits signed long.

## Approach

Compute sum of maxima and sum of minima separately via contribution boundaries, then subtract. Linearity lets every subarray's range decompose this way.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[1,2] range1, [2,3] range1, [1,2,3] range2; singletons zero; total4.

## Complexity

O(n) time/space.

## Edge cases and Java 8 mistakes

Use long before multiplying index spans; extreme unconstrained inputs can still exceed long.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

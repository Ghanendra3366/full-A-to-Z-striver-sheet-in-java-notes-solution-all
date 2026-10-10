# Largest rectangle in a histogram

## Problem and contract

Nonnegative unit-width bars; return largest rectangular area fitting below the histogram.

## Approach

When a lower/equal bar arrives, pop bars whose right boundary is now known. The new stack top is the nearest smaller left boundary; popped height spans i-left-1 bars.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Height 5 covers bars 5 and 6, area 10.

## Complexity

O(n) time/space.

## Edge cases and Java 8 mistakes

Flush at virtual index n without dereferencing a[n]. Area multiplication must be long.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
10
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

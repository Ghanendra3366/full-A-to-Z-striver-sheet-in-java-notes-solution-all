# Maximum Rectangles

## Problem and contract

Largest all-one rectangle area in a rectangular binary matrix.

## Approach

Each row is a histogram of consecutive ones ending there. Every all-one rectangle has a bottom row, so maximizing the histogram rectangle at every row considers all candidates.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

At row 2, columns 2..4 each have height at least 2, yielding area 6.

## Complexity

O(rows*cols) time; O(cols) heights/stack.

## Edge cases and Java 8 mistakes

Reset height to zero on a zero cell; do not sum ones across gaps.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
6
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# KMP Algorithm or LPS array

## Problem and contract

Return all zero-based starts of pattern in text, including overlapping matches. Empty pattern matches every boundary.

## Approach

LPS stores each prefix's longest proper prefix that is also suffix. On mismatch, fall back to that border rather than rechecking known characters. After a match, fall back to allow overlaps.

## Other approaches

Direct comparison at each start is O(n*m) worst time and O(1) auxiliary space.

## Dry run

ababa contains aba at 0; after matching, keep border a and match again at 2.

## Complexity

O(n+m) time; O(m) failure array plus output.

## Edge cases and Java 8 mistakes

Do not reset pattern index to zero after every full match; that loses the efficiency/border invariant.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Longest Consecutive Sequence in an Array

## Problem and contract

Return the longest run of consecutive integer VALUES, regardless of input order. Duplicates do not extend a run.

## Approach

Start expansion only where x-1 is absent. Each unique value is visited once by its run, so repeated expansions are avoided.

## Other approaches

Sort a copy and scan in O(n log n) time, ignoring duplicate values.

## Dry run

Start at 1 and walk 2,3,4: length 4. 100 and 200 each form length 1.

## Complexity

Expected O(n) time; O(u) space.

## Edge cases and Java 8 mistakes

Guard MIN_VALUE/MAX_VALUE before +/-1 to prevent wraparound.

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

# Count and say

## Problem and contract

Starting at term 1="1", each next term describes runs of the previous term.

## Approach

For every maximal run, append its length then its character. Runs partition the old term, producing one unambiguous next term.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1 -> 11 -> 21 -> 1211 -> 111221.

## Complexity

O(sum of generated term lengths) time; O(max consecutive term lengths) memory.

## Edge cases and Java 8 mistakes

n is one-based. Read a completed previous string; do not mutate it while discovering runs.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
111221
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Minimum Window Subsequence

## Problem and contract

Return the shortest substring in which t appears as a SUBSEQUENCE in order; ties choose leftmost.

## Approach

For each target prefix and source prefix, store the latest possible start of a matching subsequence. Matching the next character extends the prior-prefix state; otherwise carry the current row state. Latest start gives the shortest window for a fixed end.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

bde matches within bcde and bdde, both length four; the first is kept.

## Complexity

O(n*m) time; O(n) rolling DP space.

## Edge cases and Java 8 mistakes

Do not confuse subsequence coverage with unordered character-count coverage; Minimum Window Substring solves a different contract.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
bcde
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

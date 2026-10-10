# Word Break

## Problem and contract

Decide whether the whole string segments into reusable nonempty dictionary words; empty string succeeds.

## Approach

dp[end] is true if some reachable prefix start precedes a dictionary suffix ending there. Bound search by longest word length.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

dp[4] from leet is true; then code makes dp[8] true.

## Complexity

O(n*L²) worst expected time including Java substring/hash costs; O(n+dictionary size) state.

## Edge cases and Java 8 mistakes

Empty dictionary tokens are ignored by the start<end loops. This returns existence, not every segmentation.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

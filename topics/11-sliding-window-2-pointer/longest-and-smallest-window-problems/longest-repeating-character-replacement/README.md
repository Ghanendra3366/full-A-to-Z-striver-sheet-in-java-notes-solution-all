# Longest Repeating Character Replacement

## Problem and contract

Uppercase A..Z only. Change at most k characters to make a substring consist of one repeated character.

## Approach

The replacements required are window length minus the largest frequency. Recompute the exact maximum over 26 counters when shrinking; every kept window is actually feasible.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

AABA has 3 As and 1 B; one replacement gives AAAA, length 4.

## Complexity

O(26*n) time, O(26) space.

## Edge cases and Java 8 mistakes

A stale-max optimization also achieves linear time but uses a different proof; this version keeps exact window validity for clarity.

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

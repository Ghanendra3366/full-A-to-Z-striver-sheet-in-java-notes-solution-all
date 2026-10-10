# Letter Combinations of a Phone Number

## Problem and contract

Return all letter strings represented by digits 2..9; empty input returns empty.

## Approach

At each digit branch over its letters; copy the path after processing all digits. The product of independent per-digit choices gives every combination.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Choose a/b/c for 2, then d/e/f for 3.

## Complexity

O(n*4^n) worst time/output; O(n) stack/path.

## Edge cases and Java 8 mistakes

Digits 0/1 have no letters and are rejected rather than silently skipping positions.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[ad, ae, af, bd, be, bf, cd, ce, cf]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

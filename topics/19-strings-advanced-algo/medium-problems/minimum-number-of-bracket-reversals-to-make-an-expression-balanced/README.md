# Minimum number of bracket reversals to make an expression balanced

## Problem and contract

For a string of { and }, reverse individual braces to make it balanced; return minimum reversals or -1.

## Approach

Cancel matched pairs. Remaining unmatched braces consist of closes then opens. Two closes or two opens need one reversal; odd leftover counts each need rounding up.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

After cancellation, compute ceil(unmatchedOpen/2)+ceil(unmatchedClose/2).

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

An odd total length can never balance. Parenthesis-type mixing requires a different contract.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

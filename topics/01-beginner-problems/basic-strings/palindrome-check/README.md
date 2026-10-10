# Palindrome Check

## Problem and contract

Exact, case-sensitive palindrome check; punctuation is not ignored.

## Approach

Compare matching ends. If every pair matches, reversing does not change the sequence.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

l==l, e==e, then central v ends the scan.

## Complexity

O(n) time and O(1) space.

## Edge cases and Java 8 mistakes

Empty string is a palindrome. Normalize separately if a judge ignores punctuation/case.

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

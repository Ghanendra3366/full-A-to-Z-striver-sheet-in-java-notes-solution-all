# Shortest Palindrome

## Problem and contract

Add characters only at the FRONT to make a shortest palindrome. Input is ASCII/ordinary BMP characters, excluding surrogate-pair semantics.

## Approach

Find the longest palindromic prefix via LPS on s, a unique sentinel, and reverse(s). The unmatched suffix must be mirrored in front; no shorter addition could cover it.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Longest palindromic prefix is aacecaa; unmatched a is mirrored in front.

## Complexity

O(n) time/space.

## Edge cases and Java 8 mistakes

A literal separator might appear in input; integer sentinel -1 cannot equal a char value. StringBuilder.reverse handles surrogate pairs differently from the code-unit LPS, so the stated character contract matters.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
aaacecaaa
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

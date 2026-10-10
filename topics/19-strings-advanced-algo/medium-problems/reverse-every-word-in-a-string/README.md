# Reverse every word in a string

## Problem and contract

Interpret this sheet item as reverse WORD ORDER, retaining letters within words and normalizing whitespace.

## Approach

Tokenize whitespace-delimited words, then append them in reverse index order with one separating space.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

the,sky,is,blue -> blue,is,sky,the.

## Complexity

O(n) time and O(n) storage.

## Edge cases and Java 8 mistakes

The title can also mean reverse letters within each word. This lesson explicitly states its word-order contract; use per-word reversal for the other variant.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
blue is sky the
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Longest String Chain

## Problem and contract

Each next chain word is formed by inserting exactly one character into its predecessor. Return maximum chain length.

## Approach

Sort by length, then delete each character of a word to generate all possible predecessors. Their lengths are already processed; use the best chain stored by full string.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

a->ba->bca->bdca has four words.

## Complexity

O(n log n+sum(wordLength²)) expected time due to string copying/hashing; O(total word characters) stored keys.

## Edge cases and Java 8 mistakes

Equal-length words are not predecessors. Deleting from an empty string has no candidates but its own chain length is one.

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

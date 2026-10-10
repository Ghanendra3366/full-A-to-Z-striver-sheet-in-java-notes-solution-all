# Valid Anagram

## Problem and contract

Check equal multiplicity of UTF-16 code units; exact case matters.

## Approach

Increment for one string and decrement for the other. All counters zero means each character appears equally often.

## Other approaches

Sorting both char arrays costs O(n log n) time and O(n) space.

## Dry run

Both strings contain a three times, n once, g once, r once, m once.

## Complexity

O(n+65536) time, O(65536) space; the alphabet bound is fixed.

## Edge cases and Java 8 mistakes

For lowercase letters only, 26 counters suffice. Code-point anagrams need a different representation.

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

[Curriculum index](../../../../COVERAGE.md)

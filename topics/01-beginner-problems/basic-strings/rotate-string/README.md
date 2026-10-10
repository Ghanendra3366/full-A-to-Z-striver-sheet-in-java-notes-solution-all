# Rotate String

## Problem and contract

Return whether goal is a cyclic rotation of s; empty rotates to empty.

## Approach

Every rotation starts at one position in doubled string s+s. Equal length is essential to prevent accepting shorter substrings.

## Other approaches

Try all n rotation offsets in O(n²) time, or use KMP over s+s in O(n).

## Dry run

abcdeabcde contains cdeab starting at index 2.

## Complexity

O(n²) worst-case substring search on Java 8; O(n) concatenation space.

## Edge cases and Java 8 mistakes

Do not label String.contains as guaranteed linear; use KMP for O(n) search.

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

# Longest Substring Without Repeating Characters

## Problem and contract

Return the longest substring length with all UTF-16 characters distinct.

## Approach

When character c repeats inside the window, move left past its previous occurrence. Never move left backwards. The maintained interval contains no repeated character.

## Other approaches

Enumerate starts and expand until a repeat in O(n²) time.

## Dry run

abc reaches length 3; repeated a moves left to 1, preserving unique bca.

## Complexity

Expected O(n) time; O(u) space.

## Edge cases and Java 8 mistakes

For abba, last a is outside the current window; max(left,previous+1) prevents an incorrect backward move.

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

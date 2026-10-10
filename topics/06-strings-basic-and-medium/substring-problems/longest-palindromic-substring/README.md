# Longest Palindromic Substring

## Problem and contract

Return a longest contiguous palindrome; ties keep the earliest center discovered.

## Approach

Every palindrome has an odd center or an even center between characters. Expand both kinds at every index, retaining the longest.

## Other approaches

Checking each substring character-by-character costs O(n³). DP takes O(n²) time/space; Manacher can achieve O(n) time.

## Dry run

At center a in babad expand b-a-b; later aba ties length 3 and does not replace bab.

## Complexity

O(n²) worst time; O(1) auxiliary state plus O(answer length) substring output.

## Edge cases and Java 8 mistakes

Empty input returns empty. Substring and subsequence are different problems.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
bab
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

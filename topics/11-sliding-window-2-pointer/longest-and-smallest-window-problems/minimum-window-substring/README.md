# Minimum Window Substring

## Problem and contract

Return the shortest substring of s containing every character of t with multiplicity, or empty. Ties keep the earliest.

## Approach

need tracks outstanding multiplicities (negative means surplus). Expand until missing becomes zero, then shrink while covering t. Each removed necessary character makes the window invalid again.

## Other approaches

Enumerate all starts and scan to coverage in O(n²) time.

## Dry run

ADOBEC covers ABC, then shrink; later BANC covers all three in four characters.

## Complexity

O(n+m+65536) time; O(65536) auxiliary counters plus output.

## Edge cases and Java 8 mistakes

Repeated characters in t matter. Empty t returns empty. Characters are UTF-16 code units.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
BANC
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

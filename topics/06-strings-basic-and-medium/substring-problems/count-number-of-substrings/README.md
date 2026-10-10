# Count Number of Substrings

## Problem and contract

Count substrings with exactly k distinct UTF-16 characters.

## Approach

Exactly k = atMost(k)-atMost(k-1). Each valid at-most window ending at r contributes r-l+1 suffixes.

## Other approaches

Directly enumerate substrings and update counts in O(n²) time.

## Dry run

pqpqs has six valid substrings in pqpq with exactly two distinct, plus qs, totaling seven.

## Complexity

Expected O(n) time; O(u) space.

## Edge cases and Java 8 mistakes

The source title does not specify a variant; this lesson explicitly chooses exactly k distinct. k<=0 returns zero for nonempty substrings.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
7
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

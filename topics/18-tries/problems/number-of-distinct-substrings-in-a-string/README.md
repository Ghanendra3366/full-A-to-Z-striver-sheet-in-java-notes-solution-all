# Number of distinct substrings in a string

## Problem and contract

Count DISTINCT substring values, INCLUDING the empty substring, for lowercase input.

## Approach

Insert every suffix into a trie. Every nonroot node represents one unique nonempty substring as its root path; count only newly created nodes and add one for empty.

## Other approaches

Suffix automata can count distinct substrings in O(n) states/time for fixed alphabet, but require a different construction.

## Dry run

ababa has 9 distinct nonempty substrings; adding empty gives 10.

## Complexity

O(n²) time, O(26*n²) worst trie space.

## Edge cases and Java 8 mistakes

Many judges exclude empty; return count-1 for that variant. This counts distinct values, not n*(n+1)/2 occurrences.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
10
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

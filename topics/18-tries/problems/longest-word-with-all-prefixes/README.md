# Longest Word with All Prefixes

## Problem and contract

Return longest lowercase word whose every nonempty prefix is also in the dictionary; ties are lexicographic. Return empty if absent.

## Approach

Insert all words, then walk each word checking end>0 at every prefix node. This directly tests the contract.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

n,ni,nin,ninj,ninja all exist; ninga fails at ning.

## Complexity

O(total word characters) time; O(total trie nodes*26) space.

## Edge cases and Java 8 mistakes

A trie path existing does not imply it is a complete inserted prefix; check end counters.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
ninja
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

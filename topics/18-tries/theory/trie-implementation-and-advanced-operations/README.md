# Trie Implementation and Advanced Operations

## Problem and contract

Lowercase trie supporting insert, exact search and prefix search. Advanced variant additionally counts duplicate words and erases one occurrence safely.

## Approach

Every root-to-node path represents one prefix. pass counts inserted word occurrences traversing the node; end counts exact word occurrences. Erase first confirms existence so counters cannot underflow.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Two insertions of apple make its end count 2; deleting once changes it to 1 while app remains a live prefix.

## Complexity

O(word length) time per operation; O(total distinct-prefix nodes*26) storage. Erase retains allocated nodes, so memory tracks historical prefixes.

## Edge cases and Java 8 mistakes

Search is not the same as prefix existence: app is a prefix but not a complete word unless inserted. Empty strings are supported at root. Character validation occurs before insert mutates counters.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
true
1
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

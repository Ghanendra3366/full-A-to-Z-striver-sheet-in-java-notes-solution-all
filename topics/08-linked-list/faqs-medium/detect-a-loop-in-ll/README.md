# Detect a loop in LL

## Problem and contract

Detect a cycle, return its entry VALUE (-1 absent), or count its length as indicated by the title. The reusable entry method returns the node identity.

## Approach

Floyd slow/fast pointers meet if a cycle exists. After meeting, resetting one pointer to head and moving both one step locates the entry. Walking one lap from entry gives cycle length.

## Other approaches

A HashSet of visited node identities uses O(n) storage.

## Dry run

1 -> 2 -> 3 -> 2... has entry node 2 and cycle length 2.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Compare node identity, not equal values. Do not call view on a cyclic list. The -1 VALUE adapter is ambiguous for negative node values; use entry directly.

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

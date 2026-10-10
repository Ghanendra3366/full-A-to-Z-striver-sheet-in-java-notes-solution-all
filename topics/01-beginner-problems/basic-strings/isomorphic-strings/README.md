# Isomorphic Strings

## Problem and contract

Return whether a one-to-one mapping of UTF-16 characters changes s into t.

## Approach

Maintain forward and reverse maps. Forward consistency enforces repeated-character matches; reverse consistency prevents two source characters from sharing one destination.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

e->a, g->d, second g remains d.

## Complexity

Expected O(n) time; O(u) space.

## Edge cases and Java 8 mistakes

A forward map alone wrongly accepts ab -> cc. Lengths must match.

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

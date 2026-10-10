# Balanced Paranthesis

## Problem and contract

Check well-nested (),[],{} only.

## Approach

A closing delimiter must match the most recent unmatched opening delimiter, so LIFO is the correct invariant. No openings may remain at end.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

{ then [ then ( are pushed; ),],} pop the matching reverse order.

## Complexity

O(n) time; O(n) worst stack.

## Edge cases and Java 8 mistakes

Matching counts alone do not ensure correct nesting: ([)] is invalid.

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

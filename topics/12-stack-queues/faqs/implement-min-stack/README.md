# Implement Min Stack

## Problem and contract

Integer stack with O(1) minimum query; empty removal/minimum throws.

## Approach

A parallel stack stores the minimum at each depth. Push derives the new prefix minimum; pop removes both depths simultaneously.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Values 3,1,2 store prefix minima 3,1,1; after two pops minimum restores to 3.

## Complexity

O(1) each operation, O(n) storage.

## Edge cases and Java 8 mistakes

Duplicate minima need separate depth entries; this implementation handles them naturally.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

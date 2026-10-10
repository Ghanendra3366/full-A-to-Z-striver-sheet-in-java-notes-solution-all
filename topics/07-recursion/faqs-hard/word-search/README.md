# Word Search

## Problem and contract

Find a word via orthogonal steps in a rectangular character board without reusing a cell.

## Approach

Try each start and recursively match one character per step. Mark a cell only for the current path, restoring it before returning so other paths may use it.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

ABCCED follows A(0,0),B(0,1),C(0,2),C(1,2),E(2,2),D(2,1).

## Complexity

O(rows*cols*4^wordLength) safe upper bound; O(rows*cols+wordLength) auxiliary space.

## Edge cases and Java 8 mistakes

A global permanently visited set is wrong: reuse is forbidden within a path, not across alternative searches.

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

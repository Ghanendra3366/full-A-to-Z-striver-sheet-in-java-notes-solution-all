# Root to Given Node Path

## Problem and contract

Return root-to-target path by node identity, empty if absent.

## Approach

DFS appends current root; a successful branch retains its path, while failed branches pop before returning. Identity is unambiguous even when values repeat.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

To node5, failed left branch backtracks; right path4,6,5 succeeds.

## Complexity

O(n) time, O(h) working/output path.

## Edge cases and Java 8 mistakes

Do not globally reset a path after a successful find; retain exactly that branch.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[4, 6, 5]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

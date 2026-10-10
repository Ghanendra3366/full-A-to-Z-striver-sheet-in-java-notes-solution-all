# Right/Left View of BT

## Problem and contract

Return [rightView,leftView], one visible value per depth.

## Approach

The last and first values respectively in each left-to-right BFS level define the views.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sample right edges 4,6,7; left edges 4,2,1.

## Complexity

O(n) time/space.

## Edge cases and Java 8 mistakes

Horizontal columns used for top/bottom views do not define side views.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[4, 6, 7], [4, 2, 1]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

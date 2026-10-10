# Minimum Path Sum in Grid

## Problem and contract

Minimum sum of a top-left to bottom-right path moving only right/down; include both endpoint cells.

## Approach

dp[r][c]=cell+min(above,left). At boundaries only one predecessor exists. In the rolling row d[c] is above and d[c-1] is current left.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1->3->1->1->1 sums7.

## Complexity

O(R*C) time, O(C) space.

## Edge cases and Java 8 mistakes

Negative values are supported because the movement graph is acyclic. This differs from falling-path diagonal movement.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
7
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Number of Substrings Containing All Three Characters

## Problem and contract

For a string containing only a,b,c, count substrings containing all three at least once.

## Approach

For endpoint i, a start is valid exactly when it is at or before the earliest of the latest a/b/c positions. That contributes min(last)+1 starts.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Endpoints 2,3,4,5 contribute 1,2,3,4 respectively, totaling 10.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Before all three appear, one last index is -1 and contribution is zero. Return long for quadratic counts.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
10
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

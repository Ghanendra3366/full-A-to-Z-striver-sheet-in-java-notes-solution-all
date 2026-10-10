# Jump Game - I

## Problem and contract

Nonnegative jump lengths allow any jump up to a[i]; determine whether last index is reachable from zero. Empty input is false.

## Approach

All indices up to far are reachable. If next i lies outside far there is a gap no prior jump crosses; otherwise update the frontier.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

At 0 frontier 2; at 1 frontier 4, reaching the last index.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Use long for i+a[i]. A singleton is reachable without a jump.

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

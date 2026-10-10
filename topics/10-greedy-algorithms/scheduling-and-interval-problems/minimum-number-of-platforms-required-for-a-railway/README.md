# Minimum number of platforms required for a railway

## Problem and contract

Each train has arrival<=departure on the same day. Count minimum simultaneous platforms; an arrival exactly at a departure needs another platform.

## Approach

Sort event times independently and sweep. An arrival increases active platforms; a departure frees one. Maximum concurrent active trains is both necessary and sufficient.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

At 1100 the trains arriving 940,950,1100 overlap until 1120, requiring three.

## Complexity

O(n log n) time; O(n) copies.

## Edge cases and Java 8 mistakes

Overnight trains need a normalized day-aware timeline. Change <= to < if touching times may reuse a platform.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

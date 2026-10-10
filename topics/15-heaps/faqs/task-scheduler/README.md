# Task Scheduler

## Problem and contract

Unit tasks A..Z, repeated same task needs at least cooldown intervening time units. Return minimum total including idle.

## Approach

The most frequent tasks force max-1 frames of length cooldown+1 plus the tied maximum tasks at the tail. If other tasks fill more than this lower bound, total task count dominates; arranging tasks in those frames achieves it.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

A B idle A B idle A B uses eight units for cooldown two.

## Complexity

O(n+26) time; O(26) space.

## Edge cases and Java 8 mistakes

Idle contributes time but not tasks. Empty input returns zero via max(total,frameBound).

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
8
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Cheapest flight within K stops

## Problem and contract

Directed flights [u,v,cost], at most stops intermediate cities (stops+1 edges). Return cost or -1.

## Approach

Layered Bellman relaxation copies the prior layer so one round adds at most one edge. In-place updates would accidentally permit multiple edges in a single round.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O((stops+1)*E+stops*V) time; O(V) space.

## Edge cases and Java 8 mistakes

A global shortest-cost visited marker alone cannot enforce stop count; layer/state matters.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
200
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

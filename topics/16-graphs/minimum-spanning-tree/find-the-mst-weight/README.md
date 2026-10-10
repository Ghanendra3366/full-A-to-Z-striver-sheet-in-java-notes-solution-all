# Find the MST weight

## Problem and contract

Undirected edges [u,v,weight], negative weights allowed; return MST weight or throw if disconnected.

## Approach

Kruskal accepts sorted edges only across different components. Each is a safe cut edge; rejecting same-component edges prevents cycles.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(E log E+E alpha(V)) time; O(V+E) space.

## Edge cases and Java 8 mistakes

A disconnected graph gives a forest, which this MST API explicitly rejects. Use long total.

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

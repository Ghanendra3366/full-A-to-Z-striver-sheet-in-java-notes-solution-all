# Number of operations to make network connected

## Problem and contract

One operation relocates one existing cable; return minimum operations to connect all vertices or -1.

## Approach

Any connected graph needs at least n-1 edges. With enough total edges, redundant cycle edges can connect separate components, needing components-1 relocations.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E alpha(V)) time; O(V) space.

## Edge cases and Java 8 mistakes

Use zero-based vertices, validate input shape at the call site, and restart traversals for disconnected components where required.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

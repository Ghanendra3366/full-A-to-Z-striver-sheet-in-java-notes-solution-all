# Disjoint Set

## Problem and contract

Maintain connectivity under union operations; no deletions.

## Approach

Represent each set as a rooted parent tree. Path halving shortens find paths; union-by-size attaches the smaller root beneath the larger.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(alpha(n)) amortized per operation; O(n) storage.

## Edge cases and Java 8 mistakes

Only representative roots have meaningful aggregate size. Never treat two raw parent entries as final representatives without find.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
false
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

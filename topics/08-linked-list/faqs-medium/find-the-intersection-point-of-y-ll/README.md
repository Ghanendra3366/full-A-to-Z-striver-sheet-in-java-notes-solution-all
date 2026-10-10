# Find the intersection point of Y LL

## Problem and contract

Return the shared NODE of two acyclic chains, or null. Equal values alone do not count as intersection.

## Approach

Switch each pointer to the other head after its first null. Both traverse the same total distance a+b, aligning their shared suffix; they meet at the entry or both null.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Prefixes of length 1 and 2 join the same 8->9 objects; switching heads aligns the pointers at 8.

## Complexity

O(n+m) time; O(1) space.

## Edge cases and Java 8 mistakes

No mutation is needed. Cyclic lists require a different intersection analysis.

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

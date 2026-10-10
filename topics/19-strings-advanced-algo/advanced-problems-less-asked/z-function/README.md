# Z function

## Problem and contract

z[i] is the longest prefix matching the suffix beginning at i; z[0]=0 by convention.

## Approach

Maintain the rightmost prefix-matching box [l,r]. Inside it, reuse the corresponding earlier Z value capped at the box boundary, then extend comparisons beyond that boundary.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

aaaaa: from position 1 match four letters, then reuse progressively shorter box matches.

## Complexity

O(n) time; O(n) returned array, O(1) extra state.

## Edge cases and Java 8 mistakes

Index 0 has differing conventions; here it is explicitly zero. Use a separator absent from the alphabet for pattern+separator+text matching.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 4, 3, 2, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

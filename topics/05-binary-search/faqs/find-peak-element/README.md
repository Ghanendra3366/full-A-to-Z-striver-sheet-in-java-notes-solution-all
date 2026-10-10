# Find Peak Element

## Problem and contract

Return a STRICT local maximum index, assuming adjacent values are unequal and outside boundaries are -infinity.

## Approach

An ascending slope guarantees some peak to the right; a descending slope guarantees one on the left including mid. Retain that side.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[1,2,3,1]: slope 2<3 goes right; slope 3>1 keeps index 2.

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

Without the unequal-neighbor assumption, this finds a weak peak and may not satisfy a strict-peak judge.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

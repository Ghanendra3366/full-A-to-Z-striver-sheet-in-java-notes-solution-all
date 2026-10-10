# Maximum Sum Combination

## Problem and contract

Return the k largest pair sums a[i]+b[j], counting distinct index pairs even if sums repeat.

## Approach

Sorted arrays form a monotone sum grid. Begin at its largest corner, pop the largest candidate and add its lower-index neighbors. The frontier contains the next possible largest values; a set prevents revisiting pairs.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

4+6=10; its neighbors 3+6 and 4+5 both give 9.

## Complexity

O(n log n+m log m+k log(k+1)) time; O(n+m+k) space.

## Edge cases and Java 8 mistakes

Deduplicate coordinate pairs, not sums. Validate k against number of possible pairs.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[10, 9, 9]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Next Permutation

## Problem and contract

Mutate to the next lexicographic permutation. If none exists, wrap to the smallest.

## Approach

Find the rightmost ascending pivot. Swap with the smallest greater suffix value, found from the right because the suffix is descending. Reverse the suffix to make the increase minimal.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[1,2,3]: pivot 2, swap with 3, suffix [2] already minimal.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

A descending array has no pivot; reverse the entire array. Equal values require >= when finding the pivot.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 3, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Subsets II

## Problem and contract

Enumerate distinct value subsets when input can contain duplicates.

## Approach

Sort so duplicates are adjacent. Skip equal values at the SAME decision depth, but allow a second equal value in a deeper decision so [2,2] remains possible.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[1,2,2]: skip the second 2 as a root sibling, but permit it after taking the first 2.

## Complexity

O(n*2^n) worst output/time plus sort; O(n) stack and copy before output.

## Edge cases and Java 8 mistakes

Globally forbidding duplicates would incorrectly remove subsets that use repeated input positions.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

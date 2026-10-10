# Sum of Array Elements

## Problem and contract

Sum all entries; an empty array sums to zero.

## Approach

Running sum equals the sum of the processed prefix. Use long for accumulation.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Example input: [1, 2, 3]. Visit each entry or symmetric pair exactly once.

## Complexity

O(n) time and O(1) auxiliary space.

## Edge cases and Java 8 mistakes

Empty and single-element arrays are valid. The reverse operation mutates its argument; the other operations do not.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
6
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

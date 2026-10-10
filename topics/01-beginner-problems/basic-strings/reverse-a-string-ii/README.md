# Reverse a String II

## Problem and contract

Reverse a string as UTF-16 code units; ASCII is the intended interview input.

## Approach

Copy to a mutable char array and swap symmetric positions; then construct the result.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

java -> avaj after swapping j/a and a/v.

## Complexity

O(n) time and O(n) result/array space.

## Edge cases and Java 8 mistakes

Surrogate pairs need code-point handling for general Unicode. Strings cannot be modified in place.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
avaj
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# 4 Sum

## Problem and contract

Return unique sorted value quadruples summing to target, using four different indices.

## Approach

Fix two sorted positions, then solve two-sum on the suffix. Skip duplicates at both fixed positions and both moving endpoints.

## Other approaches

Four nested loops take O(n⁴); pair-sum hashing can improve time with substantial duplicate/index bookkeeping and O(n²) storage.

## Dry run

Fix -2,-1 -> need 3, giving 1,2; fix -2,0 -> need 2, giving 0,2.

## Complexity

O(n³) time, O(n) copy plus output storage.

## Edge cases and Java 8 mistakes

Widen the FIRST addition. Casting a sum after int arithmetic is too late.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

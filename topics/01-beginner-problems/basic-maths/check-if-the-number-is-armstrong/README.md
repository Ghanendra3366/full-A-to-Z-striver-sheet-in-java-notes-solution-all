# Check if the Number is Armstrong

## Problem and contract

A d-digit nonnegative number is Armstrong when it equals the sum of its digits raised to d.

## Approach

Count digits, compute each power using integer multiplication, and compare the sum.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

9474: 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474.

## Complexity

O(d²) arithmetic operations; O(d) temporary space for digit-count conversion.

## Edge cases and Java 8 mistakes

153 uses cubes, but 9474 uses fourth powers. Avoid floating-point Math.pow equality.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

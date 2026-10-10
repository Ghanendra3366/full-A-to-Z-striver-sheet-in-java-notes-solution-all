# Check if a Number is Power of 2 or Not

## Problem and contract

Check whether a positive int is an integral power of two.

## Approach

A positive power of two has exactly one set bit; clearing the lowest bit leaves zero.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

10000 & 01111 = 00000.

## Complexity

O(1) for one fixed-width int; O(n) for array XOR/state scans. O(1) space.

## Edge cases and Java 8 mistakes

Java int overflow and shifts operate on fixed 32-bit patterns here. Never shift by an unchecked index of 32; it would shift by zero.

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

[Curriculum index](../../../../COVERAGE.md)

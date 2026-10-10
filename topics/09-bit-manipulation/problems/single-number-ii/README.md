# Single Number - II

## Problem and contract

Exactly one value occurs once; every other value occurs three times.

## Approach

Each bit has a finite-state count modulo three, represented by once/twice. Third occurrence clears the bit.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For 2 its bit cycles once -> twice -> neither; 3 remains once.

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
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

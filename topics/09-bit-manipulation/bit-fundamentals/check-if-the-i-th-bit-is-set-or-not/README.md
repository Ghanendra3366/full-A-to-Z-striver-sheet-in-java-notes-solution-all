# Check if the i-th bit is Set or Not

## Problem and contract

Use zero-based bit indices from the least-significant bit.

## Approach

Mask only bit i; a nonzero intersection means it was set.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

10 is binary 1010; bit 1 is one.

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

[Curriculum index](../../../../curriculum/COVERAGE.md)

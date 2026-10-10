# Count the Number of Set Bits

## Problem and contract

Count set bits in the complete 32-bit pattern.

## Approach

Brian Kernighan clears one set bit per iteration.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

-1 contains 32 one bits, so 32 iterations clear them.

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
32
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

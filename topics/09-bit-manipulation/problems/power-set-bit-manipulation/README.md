# Power Set Bit Manipulation

## Problem and contract

Enumerate positional subsets, including empty. Duplicate input values can create equal value lists.

## Approach

A mask chooses each index independently. Every subset corresponds to exactly one n-bit mask.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Masks 00,01,10,11 select {},{1},{2},{1,2}.

## Complexity

O(n*2^n) time and output storage; O(n) working subset.

## Edge cases and Java 8 mistakes

Java shifts mask counts; constrain n explicitly, and respect exponential memory. This teaching implementation limits n to 20.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[], [1], [2], [1, 2]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

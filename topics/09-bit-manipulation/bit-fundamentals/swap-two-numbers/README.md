# Swap Two Numbers

## Problem and contract

Return swapped values; primitive caller variables cannot be mutated through method arguments.

## Approach

XOR swaps local copies without an extra integer temporary; returning an array communicates both results.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

a=3^7; b=(3^7)^7=3; a=(3^7)^3=7.

## Complexity

O(1) time/space.

## Edge cases and Java 8 mistakes

Prefer a temporary variable in normal Java code for readability. XOR-swapping an array entry with itself would zero it.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[7, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

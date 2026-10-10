# Maximum Product Subarray in an Array

## Problem and contract

Return the exact maximum product of a nonempty contiguous subarray.

## Approach

Track both maximum and minimum products ending at each position. Multiplying by a negative swaps the roles of extremes; include the singleton value to allow starting over.

## Other approaches

Enumerate all subarrays in O(n²) multiplications for a reference approach.

## Dry run

2 -> hi=6 at 3 -> at -2 hi=-2,lo=-12 -> at 4 hi=4,lo=-48; best remains 6.

## Complexity

O(n) BigInteger multiply operations; bit cost and retained storage depend on product length.

## Edge cases and Java 8 mistakes

Zero resets ending products. BigInteger avoids silent overflow for long products.

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

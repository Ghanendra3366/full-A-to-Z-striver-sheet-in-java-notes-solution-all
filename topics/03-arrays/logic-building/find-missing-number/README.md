# Find missing number

## Problem and contract

n distinct values from [0,n] contain exactly one missing value; return it.

## Approach

XOR all indices 0..n and all entries. Each present value appears twice and cancels, leaving the missing one.

## Other approaches

Summation uses n*(n+1)/2 minus array sum, but widen before multiplication; XOR avoids that arithmetic overflow.

## Dry run

(0^1^2^3)^(3^0^1)=2.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Duplicates or values outside [0,n] violate the contract.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

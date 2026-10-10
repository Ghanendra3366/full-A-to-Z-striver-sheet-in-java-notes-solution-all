# Count number of odd digits in a number

## Problem and contract

Count odd decimal digits of a signed int; zero contributes no odd digit.

## Approach

Extract n % 10 and test its parity. Negative odd remainders are still nonzero modulo two.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Digits 0,2,5,3,1 contain three odd digits.

## Complexity

O(d) time; O(1) space.

## Edge cases and Java 8 mistakes

Do not check remainder == 1: Java gives -1 for negative odd values.

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

[Curriculum index](../../../../curriculum/COVERAGE.md)

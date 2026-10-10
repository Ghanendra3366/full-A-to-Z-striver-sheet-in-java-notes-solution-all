# Return the Largest Digit in a Number

## Problem and contract

Return the largest decimal digit, ignoring sign.

## Approach

Har extracted digit ke baad largest is the maximum of all processed digits.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Process 3,9,2: maximum becomes 3,9,9.

## Complexity

O(d) time and O(1) space.

## Edge cases and Java 8 mistakes

abs is applied only to a remainder in [-9,9], so Integer.MIN_VALUE is safe.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
9
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

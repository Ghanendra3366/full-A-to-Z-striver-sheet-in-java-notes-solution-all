# Check for Perfect Number

## Problem and contract

A positive integer is perfect when its positive proper divisors sum to itself.

## Approach

Divisors arrive in pairs d and n/d; visit the smaller partner only. Start with divisor 1 and omit n.

## Other approaches

Checking every possible divisor takes O(n) time with the same constant extra space.

## Dry run

28 has proper divisors 1,2,4,7,14 whose sum is 28.

## Complexity

O(sqrt(n)) time; O(1) space.

## Edge cases and Java 8 mistakes

1 is not perfect. Add the square-root divisor only once; use n/d rather than d*d to avoid overflow.

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

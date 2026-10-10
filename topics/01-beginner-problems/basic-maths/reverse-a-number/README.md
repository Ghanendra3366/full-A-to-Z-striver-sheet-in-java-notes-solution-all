# Reverse a number

## Problem and contract

Reverse decimal digits while preserving sign. Return long so every reversed int fits.

## Approach

Append each last digit to the result: rev * 10 + digit. Remaining n contains exactly the unprocessed digits.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

-120 gives 0, then -2, then -21.

## Complexity

O(d) time and O(1) space.

## Edge cases and Java 8 mistakes

Trailing zeros disappear. If a judge requires int and zero on overflow, check the long result against Integer.MIN_VALUE/MAX_VALUE before casting.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
-21
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

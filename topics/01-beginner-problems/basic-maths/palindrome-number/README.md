# Palindrome Number

## Problem and contract

Check whether a nonnegative integer reads the same forwards and backwards. Negative inputs are false.

## Approach

Reverse into long, then compare with the original. Equality means every positional digit matches.

## Other approaches

A half-reversal stops when the unprocessed prefix is no larger than the reversed suffix; compare n == half or n == half / 10 to handle odd lengths.

## Dry run

1221 reverses through 1 -> 12 -> 122 -> 1221.

## Complexity

O(d) time, O(1) space.

## Edge cases and Java 8 mistakes

0 is a palindrome; 10 is not. A long accumulator avoids overflow.

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

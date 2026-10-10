# Count all Digits of a Number

## Problem and contract

Count decimal digits, excluding the sign; zero has one digit.

## Approach

Har division by 10 last digit hataata hai. A do-while loop handles zero without a special branch. Signed division also works for negative numbers.

## Other approaches

String.valueOf(n) also works after excluding the minus sign, but allocates O(d) space. Logarithms need a zero case and can round at powers of ten.

## Dry run

123: 123 -> 12 -> 1 -> 0, so three divisions count three digits.

## Complexity

O(d) time and O(1) extra space, where d is the digit count.

## Edge cases and Java 8 mistakes

Math.abs(Integer.MIN_VALUE) overflows; this implementation never takes abs(int).

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
10
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

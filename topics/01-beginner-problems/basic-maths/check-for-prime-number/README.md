# Check for Prime Number

## Problem and contract

Return true if n has exactly two positive divisors.

## Approach

A composite n has a factor at most sqrt(n), because two factors both larger than sqrt(n) would multiply to more than n.

## Other approaches

The direct O(n) approach checks 2 through n-1. For many queries use a sieve instead.

## Dry run

For 97, test 2 through 9; no divisor exists.

## Complexity

O(sqrt(n)) time; O(1) space.

## Edge cases and Java 8 mistakes

0,1 and negatives are not prime. n/d bounds the loop without int multiplication overflow.

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

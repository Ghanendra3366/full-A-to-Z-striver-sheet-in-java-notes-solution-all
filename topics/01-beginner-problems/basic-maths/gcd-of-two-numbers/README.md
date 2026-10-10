# GCD of Two Numbers

## Problem and contract

Return nonnegative gcd(a,b); define gcd(0,0)=0.

## Approach

Euclid uses gcd(a,b)=gcd(b,a%b). Any common divisor divides the remainder and vice versa.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

(48,18) -> (18,12) -> (12,6) -> (6,0).

## Complexity

O(log(min(|a|,|b|)+1)) time, O(1) space.

## Edge cases and Java 8 mistakes

Cast to long before abs so MIN_VALUE is safe. gcd can be 2147483648, so the return type is long.

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

[Curriculum index](../../../../COVERAGE.md)

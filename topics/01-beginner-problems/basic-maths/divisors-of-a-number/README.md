# Divisors of a Number

## Problem and contract

Return every positive divisor of n in increasing order.

## Approach

Collect smaller partners in increasing order, larger partners in decreasing order, then reverse the latter. This avoids a full sort.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For 36 collect low=[1,2,3,4,6], high=[36,18,12,9], then reverse high.

## Complexity

O(sqrt(n)) time plus O(number of divisors) output space.

## Edge cases and Java 8 mistakes

At d*d=n, do not duplicate d. Zero has infinitely many divisors and is rejected.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3, 4, 6, 9, 12, 18, 36]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

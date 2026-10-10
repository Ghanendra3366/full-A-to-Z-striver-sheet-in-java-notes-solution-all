# Count of Prime Numbers till N

## Problem and contract

Count primes in the inclusive range [2,n], with n >= 0.

## Approach

Sieve: when p is prime, mark p²,p²+p,... composite. Smaller multiples were marked by smaller prime factors already.

## Other approaches

Trial division for every number takes O(n sqrt(n)) time.

## Dry run

At n=10, mark 4,6,8,10 for 2 and 9 for 3; keep 2,3,5,7.

## Complexity

O(n log log n) time and O(n) space.

## Edge cases and Java 8 mistakes

The endpoint is inclusive. n=0 and n=1 return zero. Very large n needs a segmented sieve.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

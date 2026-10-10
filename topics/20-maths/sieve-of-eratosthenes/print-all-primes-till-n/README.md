# Print all primes till N

## Problem and contract

Return primes <=n, n>=0.

## Approach

Sieve composite multiples starting at p² for every unmarked p. Any composite has a prime factor <=sqrt(n), so it is eventually marked.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

2 marks evens above 2, 3 marks 9,15, then remaining values are prime.

## Complexity

O(n log log n) time; O(n) sieve plus output space.

## Edge cases and Java 8 mistakes

n=0/1 returns empty. This uses an array of n+1 entries; huge ranges need segmentation.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[2, 3, 5, 7, 11, 13, 17, 19]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

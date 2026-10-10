# Count primes in range L to R

## Problem and contract

Count primes in inclusive [l,r] for nonnegative int endpoints. Segment length is limited to ten million to bound memory.

## Approach

Sieve primes through sqrt(r), then mark only their multiples inside the segment, starting no earlier than p² so p is not marked composite.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

10..20 keeps 11,13,17,19.

## Complexity

O(sqrt(r) log log r + segmentLength*log log r + sqrt(r)) approximate sieve time; O(sqrt(r)+segmentLength) space.

## Edge cases and Java 8 mistakes

Exclude 0 and 1 separately. Use long for first multiple and marking positions to avoid endpoint overflow.

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

# Rabin Karp Algorithm

## Problem and contract

Find all exact pattern matches, using rolling hashes as a filter and direct verification for collisions.

## Approach

Compute the initial polynomial hash, then remove the outgoing character's contribution, shift by base, and add the incoming character. Matching hashes trigger exact regionMatches.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

aba hash matches window 0 and window 2; both are verified before emitting.

## Complexity

O(n+m+candidateCount*m) time; O(1) auxiliary space plus output. Worst case O(n*m), including repetitive true matches.

## Edge cases and Java 8 mistakes

Hash equality alone is not exact matching. Products fit long for this chosen base/modulus and UTF-16 alphabet.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Prime factorisation of a Number

## Problem and contract

Return prime factors with multiplicity for positive n; 1 has an empty factorization.

## Approach

Repeatedly divide by the smallest divisor. After exhausting smaller factors, the current divisor must be prime if it divides. Any leftover >1 after sqrt(current n) is prime.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

360 -> divide 2 three times leaves 45 -> divide 3 twice leaves 5 -> append 5.

## Complexity

O(sqrt(original n)) worst time; O(log n) output entries.

## Edge cases and Java 8 mistakes

Loop bound uses the shrinking n. Reject zero, whose factorization is not finite.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[2, 2, 2, 3, 3, 5]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

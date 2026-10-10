# Nth Root of a Number

## Problem and contract

Return the exact nonnegative integer nth root for power>=1 and value>=0, or -1.

## Approach

Binary search the base. During exponentiation, stop before a multiply would exceed value; this both caps work and avoids overflow.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

3³=27, so base 3 is an exact match.

## Complexity

O(power*log(value+1)) worst time; O(1) space.

## Edge cases and Java 8 mistakes

Do not use floating-point equality for exact roots. Zero root is handled separately.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

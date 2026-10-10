# XOR of numbers in a given range

## Problem and contract

XOR all nonnegative integers in the inclusive range [l,r].

## Approach

Prefix XOR from 0 repeats a four-case cycle according to n mod 4. XOR two prefixes cancels all positions before l.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

prefix(9)=1 and prefix(2)=3; 1^3=2.

## Complexity

O(1) time/space.

## Edge cases and Java 8 mistakes

The formula is for nonnegative ordered bounds, not arbitrary signed intervals.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

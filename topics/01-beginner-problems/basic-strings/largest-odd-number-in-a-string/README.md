# Largest Odd Number in a String

## Problem and contract

Given a decimal digit string without leading zeros (except "0"), return its largest-valued odd substring, or empty.

## Approach

An odd number ends at an odd digit. The rightmost odd digit permits the longest prefix, which is the largest possible candidate for the contract.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

From the right skip 0,2,4; digit 5 is odd, so retain prefix 35.

## Complexity

O(n) time including the substring copy; O(n) output space.

## Edge cases and Java 8 mistakes

No numeric parsing is needed, so huge strings are supported. Leading-zero variants need a separately defined output normalization.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
35
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

# Single Number - III

## Problem and contract

Exactly two distinct values occur once; every other value occurs twice. Return the two singletons sorted.

## Approach

XOR all gives p^q, which is nonzero. A set bit differs between p and q; partition on that bit so repeated values cancel within each group.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

3^5=6 (110); isolated bit 2 separates 3 from 5.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Signed MIN_VALUE can be an isolated bit; `(x&bit)!=0` remains correct. The input multiplicity contract is essential.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3, 5]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

# Remove K Digits

## Problem and contract

Remove exactly k digits preserving order; return the smallest nonnegative decimal number with no leading zeros (zero as "0").

## Approach

A larger preceding digit is worse than the smaller incoming digit at the earliest differing position, so remove it while deletions remain. If digits stay increasing, remaining deletions come from the end.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Remove 4 before 3, 3 before 2, and one 2 before 1; resulting 1219.

## Complexity

O(n) time/space.

## Edge cases and Java 8 mistakes

Trim zeros after selecting the sequence, not before counting deletions. All digits removed returns zero.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1219
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

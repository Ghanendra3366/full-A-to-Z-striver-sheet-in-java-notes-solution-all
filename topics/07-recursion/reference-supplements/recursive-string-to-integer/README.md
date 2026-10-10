# Recursive String to Integer

## Problem and contract

Recursive atoi: skip ASCII spaces, optional sign, read decimal prefix and clamp to signed int.

## Approach

Recursion consumes one digit per frame. Check the limit before multiplying, and immediately return the clamped limit if it would be exceeded.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

2147483649 exceeds negative magnitude limit2147483648, so result clamps to MIN_VALUE.

## Complexity

O(n) time/stack, stopping early after saturation.

## Edge cases and Java 8 mistakes

Very long strings of leading zeros still recurse deeply without saturation; the iterative atoi lesson is preferable for production input.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
-2147483648
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

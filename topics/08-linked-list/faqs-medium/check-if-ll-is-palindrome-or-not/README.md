# Check if LL is palindrome or not

## Problem and contract

Check value palindrome and restore original next links before returning.

## Approach

Find first-half tail, reverse the second half, compare corresponding values, then reverse that half back. Compare only while the second half has nodes to ignore an odd center.

## Other approaches

Copy values to an array and compare ends in O(n) time/O(n) space.

## Dry run

1->2 | 2->1 becomes first 1->2 and reversed second 1->2; both pairs match.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Avoid an early return on mismatch before restoring the list.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

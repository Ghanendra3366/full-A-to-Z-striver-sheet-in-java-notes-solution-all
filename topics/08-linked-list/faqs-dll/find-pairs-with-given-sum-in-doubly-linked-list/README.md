# Find Pairs with Given Sum in Doubly Linked List

## Problem and contract

A nondecreasing DLL; return unique VALUE pairs from two distinct nodes that sum to target.

## Approach

Move the lower pointer forward if sum is low, upper backward if high. On equality emit and skip equal endpoint values. Stop when pointers meet or cross.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1+5=6, then 2+4=6; pointers meet at 3, which cannot pair with itself.

## Complexity

O(n) time; O(number of pairs) output space.

## Edge cases and Java 8 mistakes

This duplicate-skipping kernel assumes unique values for its crossing test after an equality; for heavy duplicate multiplicities use a counted-value variant. Demo/input study contract is distinct sorted values.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[1, 5], [2, 4]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

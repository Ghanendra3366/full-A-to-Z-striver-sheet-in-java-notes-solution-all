# Check if a tree is a BST or not

## Problem and contract

Validate a strict distinct-key BST; empty is valid.

## Approach

Pass open ancestor bounds recursively. Each node must lie inside both; left tightens upper, right tightens lower. This enforces all ancestor constraints.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Left child 2 has bounds (-infinity,4), its right child 3 has (2,4).

## Complexity

O(n) time, O(h) stack.

## Edge cases and Java 8 mistakes

Use long bounds so int MIN_VALUE/MAX_VALUE remain valid keys. Immediate-child comparisons alone miss deeper violations.

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

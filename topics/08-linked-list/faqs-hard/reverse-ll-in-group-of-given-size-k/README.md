# Reverse LL in group of given size K

## Problem and contract

Reverse each FULL block of k nodes; leave a final short block unchanged.

## Approach

First verify k nodes exist, remember the following suffix, then reverse exactly up to that suffix. Reconnect the block and advance its predecessor to the former first node.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Blocks [1,2] and [3,4] reverse; trailing [5] stays unchanged.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Some platforms reverse the short final group too; this implementation explicitly preserves it.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[2, 1, 4, 3, 5]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

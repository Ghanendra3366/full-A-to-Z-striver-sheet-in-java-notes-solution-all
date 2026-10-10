# Implement stack using Linkedlist

## Problem and contract

Implement the named integer data structure; empty removal throws NoSuchElementException.

## Approach

Use the singly-list head as stack top so both push/pop touch only one node.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Insert 1 then 2: a stack removes 2; a queue removes 1.

## Complexity

Array/linked primitives O(1) each; queue-via-two-stacks O(1) amortized with O(n) worst transfer; stack-via-one-queue push O(n), pop O(1). O(capacity) fixed-array or O(n) dynamic storage.

## Edge cases and Java 8 mistakes

No sentinels collide with valid integer values. Array capacity overflow throws; linked/collection storage grows dynamically.

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

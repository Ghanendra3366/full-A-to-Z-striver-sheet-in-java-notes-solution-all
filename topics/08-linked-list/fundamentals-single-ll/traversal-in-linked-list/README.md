# Traversal in Linked List

## Problem and contract

Read values by following next until null.

## Approach

Each iteration visits exactly the next node; no array index is involved.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Run the demo and draw one box per value; trace predecessor, current and next before each link update. The expected output below shows the resulting chain.

## Complexity

O(n) time and O(1) auxiliary state (head insertion/deletion are O(1)); returned view string/list allocates O(n).

## Edge cases and Java 8 mistakes

Methods assume finite acyclic input. Return values must be assigned to retain changed heads. Singly operations maintain next links only; prev is irrelevant here. Odd/even grouping means index parity, not value parity.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

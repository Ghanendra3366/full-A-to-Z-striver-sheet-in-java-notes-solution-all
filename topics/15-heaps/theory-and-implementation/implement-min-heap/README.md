# Implement Min Heap

## Problem and contract

Resizable int min heap, supporting offer,peek,poll,isEmpty. Empty peek/poll throws.

## Approach

Offer appends and sifts up while beating parent. Poll removes root, places last at root, then sifts down to the better child. Only one root-to-leaf path can violate order after each operation.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Insert 3 then 1 then 2; root reflects the current extremum. Repeated poll emits priority order.

## Complexity

O(log n) offer/poll, O(1) peek; O(n) stored values, O(1) auxiliary state.

## Edge cases and Java 8 mistakes

No comparator subtraction is used, so extreme int values are safe. ArrayList stores boxed integers.

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

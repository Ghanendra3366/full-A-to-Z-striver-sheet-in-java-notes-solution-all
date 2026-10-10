# Implementation using different DS

Stack is LIFO: push/pop at the same end. Queue is FIFO: append at tail, remove at head. Use ArrayDeque in Java 8 for both. For stack call push/pop/peek; for queue offer/poll/peek. ArrayDeque prohibits null. Array-based fixed-capacity implementations must detect overflow and underflow; a circular queue tracks size to distinguish empty/full when head==tail. Linked structures allocate nodes and update empty head/tail cases. See the six concrete implementation lessons below.

[Curriculum index](../../../../curriculum/COVERAGE.md)

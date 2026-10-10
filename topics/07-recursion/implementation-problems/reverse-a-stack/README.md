# Reverse a Stack

## Problem and contract

Reverse a stack in place, using the front of ArrayDeque as its top.

## Approach

Remove the top recursively; after reversing the remaining stack, insert the saved top at the bottom via a second recursion.

## Other approaches

A second stack reverses in O(n) time with O(n) auxiliary storage.

## Dry run

Pop 1,2,3; insert 3 at bottom of empty, then 2 below 3, then 1 below them.

## Complexity

O(n²) time; O(n) peak recursion space.

## Edge cases and Java 8 mistakes

Deque iteration prints top-to-bottom here. Deep recursion can overflow the Java stack.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3, 2, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

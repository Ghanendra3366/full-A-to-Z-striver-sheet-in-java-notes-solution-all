# Quick Sorting

## Problem and contract

Sort an int array in nondecreasing order in place and return the same array.

## Approach

Randomly select a pivot and move it to the end. Partition into values smaller than pivot and values at least pivot; place pivot between them, then recurse on both sides.

## Other approaches

For large general arrays use Arrays.sort in application code. Compare these algorithms by stability, memory, and worst-case behavior rather than only average runtime.

## Dry run

With pivot 2 in [3,1,2], move 1 left, place 2 at index 1, then sort the one-element sides.

## Complexity

Expected O(n log n), worst O(n²) time. Expected O(log n), worst O(n) stack. Not stable.

## Edge cases and Java 8 mistakes

Empty, singleton, duplicate, sorted and reverse-sorted arrays are valid. Quick sort with Lomuto partition still degenerates on all-equal input; random pivot does not remove that case. Deep recursion can exhaust the stack.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[-1, 0, 2, 2, 5]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

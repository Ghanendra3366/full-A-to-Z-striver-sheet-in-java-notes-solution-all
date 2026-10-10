# Merge Sorting

## Problem and contract

Sort an int array in nondecreasing order in place and return the same array.

## Approach

Divide the half-open interval [l,r) in two, sort both halves, then merge by repeatedly selecting the smaller front value. Sorted fronts ensure the next selected value is globally smallest among remaining entries.

## Other approaches

For large general arrays use Arrays.sort in application code. Compare these algorithms by stability, memory, and worst-case behavior rather than only average runtime.

## Dry run

[3,1,2]: sort [3] and [1,2], then merge fronts 3/1, 3/2, leftover 3.

## Complexity

O(n log n) time, O(n) buffer plus O(log n) stack. Stable due to left-first equality.

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

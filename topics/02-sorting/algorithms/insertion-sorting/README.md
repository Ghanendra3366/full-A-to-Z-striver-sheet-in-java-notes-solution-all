# Insertion Sorting

## Problem and contract

Sort an int array in nondecreasing order in place and return the same array.

## Approach

Maintain a sorted prefix. Shift strictly larger values right, then insert the next key into the gap.

## Other approaches

For large general arrays use Arrays.sort in application code. Compare these algorithms by stability, memory, and worst-case behavior rather than only average runtime.

## Dry run

[3,1,2]: insert 1 before 3, then insert 2 between 1 and 3.

## Complexity

O(n²) worst/average time, O(n) best time; O(1) space. Stable.

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

[Curriculum index](../../../../COVERAGE.md)

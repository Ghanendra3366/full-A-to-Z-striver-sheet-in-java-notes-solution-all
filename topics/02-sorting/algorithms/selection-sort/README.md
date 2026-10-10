# Selection Sort

## Problem and contract

Sort an int array in nondecreasing order in place and return the same array.

## Approach

Pick the smallest value from the unsorted suffix and place it at its first position. After pass i, the prefix contains the i+1 smallest values in sorted order.

## Other approaches

For large general arrays use Arrays.sort in application code. Compare these algorithms by stability, memory, and worst-case behavior rather than only average runtime.

## Dry run

[3,1,2] -> [1,3,2] -> [1,2,3].

## Complexity

O(n²) comparisons in every case; O(1) auxiliary space. Not stable.

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

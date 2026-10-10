# Lower Bound

## Problem and contract

On a nondecreasing array return first index with value >= x, or length if absent.

## Approach

Use half-open [l,r). The answer is never excluded: qualifying mid keeps the left half including mid; a nonqualifying mid moves l past mid. l==r is the insertion boundary.

## Other approaches

A scan is O(n); binary search exploits sorted order.

## Dry run

For [1,2,2,4], lower boundary for 2 is 1 and upper is 3.

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

Empty array returns 0. Boundary index length is valid as a result but cannot be dereferenced.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

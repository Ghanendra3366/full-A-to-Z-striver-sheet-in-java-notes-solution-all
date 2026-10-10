# K-th Largest element in an array

## Problem and contract

Return ONE-based kth largest entry; duplicates count individually.

## Approach

Retain the largest k values in a min-heap; whenever size exceeds k, discard its smallest. Heap root is the smallest of the largest k.

## Other approaches

Sort in O(n log n); randomized quickselect has expected O(n) time but worst O(n²).

## Dry run

For k=2, final retained values are 5 and 6; root is 5.

## Complexity

O(n log(k+1)) time; O(k) space.

## Edge cases and Java 8 mistakes

Validate k before peek. kth distinct largest is a different contract.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

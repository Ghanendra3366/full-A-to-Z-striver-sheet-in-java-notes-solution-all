# Reverse Pairs

## Problem and contract

Count index pairs i<j with a[i]>2*a[j].

## Approach

Merge sort counts pairs inside both halves recursively. For cross pairs, both halves are sorted; a monotone right pointer counts valid partners for each left value before the merge destroys half boundaries.

## Other approaches

A double loop over i<j is an O(n²) reference with O(1) auxiliary space.

## Dry run

For [2,4,3,5,1], reverse pairs are (4,1),(3,1),(5,1); inversions additionally include (2,1),(4,3).

## Complexity

O(n log n) time and O(n) space including the copy; return long for pair counts.

## Edge cases and Java 8 mistakes

Widen to 2L*a[j] before multiplying. Negative inputs are supported. Count cross pairs before merging.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

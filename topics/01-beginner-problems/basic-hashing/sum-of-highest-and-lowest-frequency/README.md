# Sum of Highest and Lowest Frequency

## Problem and contract

Add the largest and smallest positive frequency of values present. Empty input returns zero.

## Approach

Only present values participate. Traverse frequency counts and maintain the two extrema.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Frequencies 2,3,1 give 3+1=4.

## Complexity

O(n log u) time, O(u) space.

## Edge cases and Java 8 mistakes

Return the sum of frequencies, not the sum of the associated values. With one distinct value, its frequency is counted twice.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

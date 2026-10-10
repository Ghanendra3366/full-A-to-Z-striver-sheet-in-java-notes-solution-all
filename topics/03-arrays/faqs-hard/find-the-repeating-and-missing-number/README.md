# Find the repeating and missing number

## Problem and contract

Input has n entries from [1,n], exactly one duplicate appearing twice and one missing. Return [repeating,missing].

## Approach

Mark values in a presence array. A repeated mark detects the duplicate; an unmarked number is missing.

## Other approaches

XOR partitioning by a set bit separates the two anomalies in O(1) space; a final scan identifies which anomaly is repeated.

## Dry run

3 is marked twice; index 4 stays unmarked.

## Complexity

O(n) time and O(n) space.

## Edge cases and Java 8 mistakes

This simple reference does not validate every structural constraint. Sum-of-squares formulas can overflow long for large n.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3, 4]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

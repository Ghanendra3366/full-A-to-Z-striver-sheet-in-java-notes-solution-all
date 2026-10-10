# Two Sum

## Problem and contract

Return two distinct zero-based indices summing to target, or [-1,-1]. Any pair is acceptable.

## Approach

Before inserting current value, look for its complement among earlier entries. This guarantees different indices.

## Other approaches

Nested pair enumeration takes O(n²) time and O(1) space. Sorting plus two pointers takes O(n log n) but needs index tracking.

## Dry run

At 2 look for 7 and store index 0; at 7 look for 2 and return [0,1].

## Complexity

Expected O(n) time and O(n) space.

## Edge cases and Java 8 mistakes

Widen complement subtraction to long; repeated equal values need two positions.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

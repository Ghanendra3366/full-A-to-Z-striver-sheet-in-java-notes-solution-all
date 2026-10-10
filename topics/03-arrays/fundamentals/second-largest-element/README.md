# Second Largest Element

## Problem and contract

Return the second largest DISTINCT value, or OptionalInt.empty if it does not exist.

## Approach

Maintain largest and second-largest distinct processed values. A new maximum demotes the old maximum; an intermediate distinct value only updates second.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

4 sets first; duplicate 4 changes nothing; 2 sets second; -1 changes nothing.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

A sentinel like -1 is ambiguous. MIN_VALUE can be a valid second largest.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

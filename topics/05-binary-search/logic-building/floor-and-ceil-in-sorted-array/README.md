# Floor and Ceil in Sorted Array

## Problem and contract

Return [floor value <=x, ceil value >=x] as OptionalInts; either may be absent.

## Approach

Floor is the value just before upper bound; ceil is the value at lower bound.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For x=4 lower=2, upper=2; a[1]=3 and a[2]=5.

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

Floor/ceil are values, not indices. OptionalInt avoids collision with a valid -1.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3 5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

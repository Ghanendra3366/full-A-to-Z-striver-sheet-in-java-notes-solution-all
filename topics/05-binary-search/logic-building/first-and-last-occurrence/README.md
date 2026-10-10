# First and Last Occurrence

## Problem and contract

Return first/last indices of x, or [-1,-1].

## Approach

Equal values occupy [lowerBound,upperBound), so the inclusive last is upper-1.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

The block of 2 is indices [1,4), giving [1,3].

## Complexity

O(log n) time; O(1) space.

## Edge cases and Java 8 mistakes

When lower==upper the value is absent, including empty input.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

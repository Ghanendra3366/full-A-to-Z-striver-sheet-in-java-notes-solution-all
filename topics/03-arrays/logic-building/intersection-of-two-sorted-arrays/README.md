# Intersection of two sorted arrays

## Problem and contract

Return sorted multiset intersection (duplicates appear min(countA,countB) times).

## Approach

Two sorted fronts let us discard the smaller unmatched value for intersection, or emit the smaller available value for union. Each pointer only moves forward.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

A=[1,2,2,4], B=[2,2,3]: equal fronts at the two occurrences of 2 contribute intersection; union emits every distinct value once.

## Complexity

O(n+m) time; O(output length) space.

## Edge cases and Java 8 mistakes

Intersection here uses multiplicity; adapt by suppressing equal outputs if the judge asks for set intersection. Both inputs must be sorted.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[2, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

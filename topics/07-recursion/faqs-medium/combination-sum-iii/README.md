# Combination Sum III

## Problem and contract

Select exactly k distinct digits from 1..9 whose sum is target.

## Approach

Choose increasing digits so each combination has one representation. State carries the next minimum digit, remaining count and remaining sum.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1+2+6, 1+3+5 and 2+3+4 are the three valid triples for nine.

## Complexity

O(2^9*9) upper-bound enumeration time; O(9) working stack plus output.

## Edge cases and Java 8 mistakes

k=0,target=0 yields an empty combination. Digits cannot repeat.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[1, 2, 6], [1, 3, 5], [2, 3, 4]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

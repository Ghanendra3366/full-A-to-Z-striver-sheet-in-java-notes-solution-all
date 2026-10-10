# Median of Two Sorted Arrays

## Problem and contract

Return the median of the sorted multiset union; at least one array must be nonempty.

## Approach

Use logarithmic kth-selection. Odd length takes the middle rank; even length averages both middle ranks.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[1,2,3,4] has middle values 2 and 3, averaging 2.5.

## Complexity

O(log(min(n,m)+1)) time; O(1) auxiliary space.

## Edge cases and Java 8 mistakes

Widen before adding middle int values. Both empty arrays have no median.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2.5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

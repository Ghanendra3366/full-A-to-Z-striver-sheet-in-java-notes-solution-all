# Sort an array of 0's 1's and 2's

## Problem and contract

Sort an array containing only 0,1,2 in place.

## Approach

Dutch National Flag invariant: [0,low) zeros, [low,mid) ones, [mid,high] unknown, (high,n) twos. Every step shrinks the unknown region.

## Other approaches

Counting 0/1/2 then overwriting also takes O(n) time and O(1) space, but uses two passes.

## Dry run

A 2 swaps to the high boundary; recheck the incoming unknown value. A 0 swaps to low, a 1 simply advances mid.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Do not advance mid after swapping with high: the incoming element has not been classified.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 0, 1, 1, 2, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

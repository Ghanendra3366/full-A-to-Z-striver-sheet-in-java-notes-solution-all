# Maximum Points You Can Obtain from Cards

## Problem and contract

Take exactly k cards, one at a time from either end, maximizing score. Values may be negative.

## Approach

Every choice takes a prefix of length k-j and a suffix of length j. Enumerate all j=0..k, updating by replacing one left card with one right card.

## Other approaches

Alternatively subtract the minimum sum window of size n-k from total in O(n) time.

## Dry run

Scores for three cards: left 1+2+3=6; then 1+2+1=4; 1+6+1=8; 5+6+1=12.

## Complexity

O(k) time; O(1) space.

## Edge cases and Java 8 mistakes

k=0 returns zero. For k=n each candidate still counts each card exactly once.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
12
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

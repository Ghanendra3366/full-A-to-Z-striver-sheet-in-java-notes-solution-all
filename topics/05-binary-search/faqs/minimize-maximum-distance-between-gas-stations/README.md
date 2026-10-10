# Minimize Maximum Distance Between Gas Stations

## Problem and contract

Add at most k stations at arbitrary real positions to minimize the largest consecutive gap.

## Approach

For gap g and candidate d, ceil(g/d)-1 new stations suffice. Sum required stations and binary search the first feasible real distance using 80 iterations.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Gap 10 with one station splits at 5, yielding maximum gap 5.

## Complexity

O(n log n+80*n) time; O(n) copy space.

## Edge cases and Java 8 mistakes

Floating-point comparisons are approximate; the returned value is intended for a judge tolerance such as 1e-6. Exact multiples require ceil-1, not floor.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
5.000000
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

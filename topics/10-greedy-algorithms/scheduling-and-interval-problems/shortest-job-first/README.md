# Shortest Job First

## Problem and contract

All jobs arrive at time zero; nonpreemptive jobs have nonnegative durations. Return average waiting time.

## Approach

Run shortest duration first. Swapping a longer-then-shorter adjacent pair reduces the waiting contributed to the shorter job without changing later completion time.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Sorted 1,2,3 gives waits 0,1,3; average 4/3.

## Complexity

O(n log n) time; O(n) copy space.

## Edge cases and Java 8 mistakes

Different arrival times require scheduling with a priority queue; this contract has simultaneous arrivals.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1.3333333333333333
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

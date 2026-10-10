# Job sequencing Problem

## Problem and contract

Each job takes one time unit and is [deadline,profit]. Maximize profit by completing before deadlines; return [jobs done,total profit]. Nonpositive-profit jobs may be skipped.

## Approach

Consider profit descending and schedule at the latest free slot before its deadline. This keeps earlier slots available for tighter deadlines. Unit-duration deadline scheduling admits this greedy exchange.

## Other approaches

A disjoint-set latest-free-slot structure improves scheduling to near-linear after sorting.

## Dry run

Schedule profit 100 at slot 2, profit 27 at slot 1, profit 15 at slot 3; total 142.

## Complexity

O(n log n+n*min(n,maxDeadline)) time; O(min(n,maxDeadline)) slot space plus sorted copy.

## Edge cases and Java 8 mistakes

The algorithm does not apply to variable-duration jobs. Deadlines <=0 are unschedulable.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3, 142]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

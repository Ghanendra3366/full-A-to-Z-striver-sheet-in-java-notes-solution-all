# Kth largest element in a stream of running integers

## Problem and contract

Track kth largest after each inserted value; return empty until k values have arrived.

## Approach

Maintain exactly the same largest-k min-heap invariant as batch selection; historical values below the threshold can be discarded permanently.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

3 then 5 retains {3,5}; 4 discards 3, leaving {4,5} and answer 4.

## Complexity

O(log k) per update, O(k) storage.

## Edge cases and Java 8 mistakes

A heap with fewer than k values cannot answer kth rank; OptionalInt makes that explicit.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

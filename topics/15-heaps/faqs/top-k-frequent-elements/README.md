# Top K Frequent Elements

## Problem and contract

Return k distinct values ranked by descending frequency then ascending value.

## Approach

Count once and sort distinct keys using the stated tie comparator. Take the first k.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Counts 1:3,2:2,3:1 give top two 1,2.

## Complexity

Expected O(n+u log u) time; O(u) space.

## Edge cases and Java 8 mistakes

k<=distinct count, not input length. For large u and small k use a size-k heap in O(n+u log k), or frequency buckets.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

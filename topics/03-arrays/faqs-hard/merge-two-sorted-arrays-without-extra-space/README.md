# Merge two sorted arrays without extra space

## Problem and contract

Both arrays are sorted. Rearrange in place so conceptual a followed by b is globally sorted, keeping array lengths fixed.

## Approach

Compare positions separated by a shrinking ceiling-half gap in the conceptual concatenation. The gap method exploits that the two initial runs are sorted; halve until the adjacent pass completes the merge.

## Other approaches

Merge into a temporary array in O(n+m) time/O(n+m) space. Repeated insertion shifting uses O(nm) time and O(1) space.

## Dry run

Conceptual [1,4,8,2,3,9]; gap 3 then 2 then 1 moves smaller second-run values into the first run.

## Complexity

O((n+m) log(n+m)) time, O(1) auxiliary space.

## Edge cases and Java 8 mistakes

This gap sequence is a merge technique for two sorted runs, not a general sorting guarantee for arbitrary input. Empty arrays are supported.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3]
[4, 8, 9]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

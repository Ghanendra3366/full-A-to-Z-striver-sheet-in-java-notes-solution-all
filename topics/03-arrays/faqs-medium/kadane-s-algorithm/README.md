# Kadane's Algorithm

## Problem and contract

Return the maximum sum of a NONEMPTY contiguous subarray of a nonempty array.

## Approach

Best subarray ending at i either starts at i or extends the best ending at i-1. Global best is the maximum of these ending states.

## Other approaches

Enumerate each start/end with a running sum in O(n²); recomputing each sum would be O(n³).

## Dry run

At 4 start a fresh subarray; extend with -1,2,1 to reach 6. The -5 lowers the ending sum but does not erase global best.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Initializing best to zero would allow an empty subarray and fail all-negative inputs. Use long sum.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
6
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Ninja's training

## Problem and contract

Exactly one of three tasks daily; consecutive days cannot repeat the same task. Scores may be negative.

## Approach

dp[day][task]=points[day][task]+max(prev[other task]). Starting from first-day scores ensures one task must be chosen even for negative values.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

70 on day0,50 on day1,90 on day2 totals210.

## Complexity

O(3*days) time, O(3) space.

## Edge cases and Java 8 mistakes

Validate nonnegative size/target parameters and respect the stated input domain. Java array dimensions must fit memory; recursion alternatives may exhaust the call stack.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
210
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

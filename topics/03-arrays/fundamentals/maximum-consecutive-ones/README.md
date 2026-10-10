# Maximum Consecutive Ones

## Problem and contract

For a binary array return the longest consecutive run of ones.

## Approach

Keep the length of the suffix consisting only of ones, reset on zero, and record the largest suffix length.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Run lengths 1,2,0,1,2,3 give maximum 3.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Empty array returns zero; a non-one value is treated as a separator.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Triangle

## Problem and contract

Row r has r+1 entries. From (r,c) move to (r+1,c) or (r+1,c+1); minimize top-to-bottom sum.

## Approach

Bottom-up dp[c]=value+min(down,diagonal). Updating left-to-right preserves the needed old d[c+1].

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

2->3->5->1 gives11.

## Complexity

O(n²) time, O(n) space.

## Edge cases and Java 8 mistakes

Validate triangular row lengths at the call site. Reverse-direction in-place updates would overwrite the next diagonal prematurely.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
11
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

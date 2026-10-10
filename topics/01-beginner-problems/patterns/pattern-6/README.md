# Pattern 6

## Problem and contract

Print pattern 6 for n rows/rings. The example defines the exact shape; n=0 prints nothing. Alphabet patterns assume n<=26.

## Approach

Outer loop selects a row. Inner loops calculate its symbols and padding directly from the row index. Trace the formulas before writing the loops; row-dependent bounds create the shape.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Use n=3 and label row/column indices. For each row, apply the bounds in Solution.java; compare the emitted row with the example below. Pattern 22 uses distance to the closest border to determine the ring value.

## Complexity

O(n²) time and O(n²) output storage; streaming directly to a writer would use O(1) auxiliary space.

## Edge cases and Java 8 mistakes

One-based symbol counts and zero-based coordinates must not be mixed. Some rows include a trailing space; verification ignores trailing spaces only. Diamond 9 repeats the widest row; butterfly 20 does not.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1 2 3 
1 2 
1
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

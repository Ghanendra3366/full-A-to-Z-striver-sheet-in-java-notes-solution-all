# Minimum multiplications to reach end

## Problem and contract

Values start/end in [0,99999]; each step multiply by an allowed nonnegative factor modulo 100000.

## Approach

Treat residues as vertices and each multiplication as a unit edge. BFS gives minimum operation count.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(100000*factors.length) time, O(100000) space.

## Edge cases and Java 8 mistakes

Cast before multiplying. start=end requires zero operations.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

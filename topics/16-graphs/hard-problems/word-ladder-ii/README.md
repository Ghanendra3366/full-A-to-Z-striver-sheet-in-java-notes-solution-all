# Word ladder II

## Problem and contract

Return ALL shortest lowercase word transformation sequences.

## Approach

BFS computes shortest distance for each word. Backtrack from end only through neighbors one distance lower; these edges form an acyclic shortest-path graph, enumerating every shortest sequence.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

BFS O(W*L²*26), plus output-sensitive backtracking; output may be exponential.

## Edge cases and Java 8 mistakes

Marking one predecessor per word loses alternate shortest sequences; distance-decreasing backtracking preserves all.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[hit, hot, dot, dog, cog], [hit, hot, lot, log, cog]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

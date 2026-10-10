# Word ladder I

## Problem and contract

One lowercase letter changes per step, every intermediate/end word in dictionary; return shortest sequence length in WORDS, zero absent.

## Approach

Implicit unit-edge word graph; BFS discovers shortest change count. Add one to count the starting word.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(W*L²*26) time under Java string creation/hash costs; O(W*L) strings/space.

## Edge cases and Java 8 mistakes

All words must have equal length and lowercase a..z. begin=end returns one even if not in dictionary.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

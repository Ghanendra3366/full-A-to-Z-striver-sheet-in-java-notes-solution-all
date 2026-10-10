# Generate Binary Strings Without Consecutive 1s

## Problem and contract

Generate length-n binary strings in lexicographic order, forbidding adjacent ones.

## Approach

Zero is always allowed; one is allowed only after zero or at the first position. This excludes invalid prefixes immediately while preserving all valid choices.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

After prefix 01 only zero is allowed, producing 010.

## Complexity

O(n*F_(n+2)) time/output space; O(n) stack.

## Edge cases and Java 8 mistakes

n=0 gives the single empty string. Save the allowed-one condition before appending/removing zero.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[000, 001, 010, 100, 101]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

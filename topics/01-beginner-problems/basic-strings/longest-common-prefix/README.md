# Longest Common Prefix

## Problem and contract

Return the longest prefix common to every string.

## Approach

Maintain the common-prefix length of all processed strings. Comparing the next string can only shrink that prefix.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

flower/flow -> flow; flow/flight -> fl.

## Complexity

O(total compared characters) time; O(prefix length) output space.

## Edge cases and Java 8 mistakes

Empty input or an empty member yields empty. Null strings are outside the contract.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
fl
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

# Subset Sums Enumeration

## Problem and contract

Return sums of all POSITIONAL subsets sorted, including duplicate sums and empty sum zero.

## Approach

Take/skip each index; each leaf is exactly one positional subset and contributes its accumulated sum.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Skip both0; only1 gives1; only2 gives2; both gives3.

## Complexity

O(2^n log(2^n)) sorting time, O(2^n) output and O(n) stack.

## Edge cases and Java 8 mistakes

Unlike distinct-subset enumeration, repeated sum values must not be removed. Exponential output limits practical n.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 1, 2, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

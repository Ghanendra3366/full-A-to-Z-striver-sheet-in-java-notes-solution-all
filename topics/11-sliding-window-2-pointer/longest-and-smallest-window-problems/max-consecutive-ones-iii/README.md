# Max Consecutive Ones III

## Problem and contract

For binary input, flip at most k zeros to ones; maximize the consecutive-one length.

## Approach

A window is valid exactly when it has <=k zeros. Expanding adds at most one zero; shrink until valid, then compare length.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Window [0,0,1,1,1,1] contains two zeros and reaches length 6.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

k=0 reduces to ordinary consecutive ones. Contract assumes all entries are binary.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
6
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

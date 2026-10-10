# Longest happy prefix

## Problem and contract

Return the longest NONEMPTY proper prefix that is also suffix, or empty if none.

## Approach

The final LPS entry is exactly the largest proper border length for the entire string.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

level begins and ends with l, but no longer proper prefix matches its suffix.

## Complexity

O(n) time and O(n) failure-array space plus output.

## Edge cases and Java 8 mistakes

The full string is not a proper prefix. Empty input has no nonempty border.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
l
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Remove duplicates from sorted array

## Problem and contract

For a nondecreasing array, return unique-prefix length and place distinct values in that prefix. Entries beyond the length are unspecified.

## Approach

Adjacent equal values form one block; copy only the first of each block.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1 copied, next 1 skipped; 2 copied, next 2 skipped; 3 copied.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Input MUST be sorted; length zero is valid. Do not print the unused suffix.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

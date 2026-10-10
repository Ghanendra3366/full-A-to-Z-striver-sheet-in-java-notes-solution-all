# Roman to Integer

## Problem and contract

Convert a valid canonical Roman numeral (normally 1..3999) to integer.

## Approach

A smaller symbol before a larger one is subtractive; all other symbols are additive.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

M + (-C+M) + (-X+C) + (-I+V) = 1000+900+90+4.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

This converter assumes valid Roman syntax; it rejects unknown symbols but does not validate canonical repetition rules.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1994
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

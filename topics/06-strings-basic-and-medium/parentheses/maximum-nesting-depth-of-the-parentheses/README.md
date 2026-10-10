# Maximum Nesting Depth of the Parentheses

## Problem and contract

Return maximum parentheses nesting in an otherwise arbitrary balanced expression.

## Approach

Track current open parentheses and maximum depth reached. Nonparenthesis characters do not change depth.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

The ((8)/4) segment sits inside an outer pair, reaching depth 3.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Malformed parentheses are rejected; an expression without parentheses has depth zero.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

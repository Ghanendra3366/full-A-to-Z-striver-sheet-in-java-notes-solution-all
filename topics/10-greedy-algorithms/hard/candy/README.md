# Candy

## Problem and contract

Every child receives at least one candy; higher rating than either neighbor needs strictly more candy. Minimize total.

## Approach

Left-to-right enforces the left-neighbor constraint minimally. Right-to-left enforces the right constraint using max to preserve the left one. Each assigned count is the minimum satisfying both slopes.

## Other approaches

A slope-based one-pass method uses O(1) space but must carefully subtract the shared peak when joining ascent and descent.

## Dry run

[1,0,2] left pass [1,1,2], right pass [2,1,2], sum 5.

## Complexity

O(n) time; O(n) space.

## Edge cases and Java 8 mistakes

Equal ratings impose no ordering requirement. Total needs long for long slopes.

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

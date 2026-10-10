# Next Smaller Element

## Problem and contract

For each entry return nearest strictly smaller value to its right; absent=-1. Return values, not indices.

## Approach

Scan backwards; pop candidates that cannot beat the current value. Each popped candidate is also hidden for any future earlier position by the closer current value. A double scan makes one full circular suffix visible.

## Other approaches

Scanning each suffix separately takes O(n²) time.

## Dry run

For [2,1,3], next greater values are 3,3,none; next smaller are 1,none,none.

## Complexity

O(n) time/space because each pushed entry pops at most once.

## Edge cases and Java 8 mistakes

Strict comparison requires popping equals. The value -1 is ambiguous for arbitrary signed arrays; indices or OptionalInt can represent absence unambiguously.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, -1, -1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Left Rotate Array by K Places

## Problem and contract

Rotate left by k in place. Negative k rotates right; normalize by length.

## Approach

Split into A (first k) and B (rest). reverse(A), reverse(B), then reverse(all) gives BA, with internal order restored.

## Other approaches

A temporary output array takes O(n) space. Repeating one-step rotation k times takes O(nk) time.

## Dry run

[1,2]|[3,4,5] -> [2,1]|[5,4,3] -> [3,4,5,1,2].

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Handle empty input before modulo. Math.floorMod supports negative k.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3, 4, 5, 1, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

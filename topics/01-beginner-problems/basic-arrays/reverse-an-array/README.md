# Reverse an array

## Problem and contract

Reverse the input array in place.

## Approach

Swap matching ends and shrink the unprocessed interval. The already processed ends are in final positions.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Example input: [1,2,3]. Visit each entry or symmetric pair exactly once.

## Complexity

O(n) time and O(1) auxiliary space.

## Edge cases and Java 8 mistakes

Empty and single-element arrays are valid. The reverse operation mutates its argument; the other operations do not.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3, 2, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

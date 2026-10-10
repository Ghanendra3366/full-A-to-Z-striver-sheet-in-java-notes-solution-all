# Move Zeros to End

## Problem and contract

Move zeros to the end in place while preserving the order of nonzero entries.

## Approach

Compact nonzero values into a prefix, then fill the remaining suffix with zeros. write never overtakes the read position.

## Other approaches

A second array is a simpler O(n)-space approach.

## Dry run

write receives 1,3,2 at positions 0,1,2; fill positions 3,4 with zero.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

The enhanced loop is safe here because writes only affect earlier/current positions.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 3, 2, 0, 0]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

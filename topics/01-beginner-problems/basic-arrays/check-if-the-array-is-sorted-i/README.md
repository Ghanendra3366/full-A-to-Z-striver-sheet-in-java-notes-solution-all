# Check if the Array is Sorted I

## Problem and contract

Check nondecreasing order; equal neighbors are allowed.

## Approach

A sequence is nondecreasing exactly when each adjacent pair is ordered.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Example input: [1,1,3]. Visit each entry or symmetric pair exactly once.

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
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

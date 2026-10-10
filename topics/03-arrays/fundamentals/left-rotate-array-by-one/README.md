# Left Rotate Array by One

## Problem and contract

Rotate left by one in place.

## Approach

Save the first value before shifting; place it at the last index.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Save 1, shift 2 and 3 left, append saved 1.

## Complexity

O(n) time and O(1) space.

## Edge cases and Java 8 mistakes

Empty and singleton arrays need no change.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[2, 3, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

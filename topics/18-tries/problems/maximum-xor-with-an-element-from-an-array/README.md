# Maximum Xor with an element from an array

## Problem and contract

Each query [x,limit] asks max x XOR value for an array value <=limit, with nonnegative values/x. Return -1 if none.

## Approach

Sort array and queries by limit. Insert each newly eligible value once, then query the trie. Restore original query order by storing its index.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For [3,1] eligible values 0,1 give max 3; for [5,6] all values eligible and 5^2=7.

## Complexity

O(n log n+q log q+31*(n+q)) time; O(31*n+q+n) space.

## Edge cases and Java 8 mistakes

Query sorting must retain original indices. Bound may be negative, yielding no eligible nonnegative values.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3, 3, 7]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

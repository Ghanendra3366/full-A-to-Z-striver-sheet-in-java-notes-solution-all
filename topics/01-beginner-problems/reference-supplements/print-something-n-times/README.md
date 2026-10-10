# Print Something N Times

## Problem and contract

Return the named recursive printing sequence, n>=0.

## Approach

A call handles one value/message, while n-1 is the strictly smaller subproblem. Recording before recursion emits descending order; recording after recursion emits ascending order.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

At n=3, frames3,2,1 are entered and then return1,2,3.

## Complexity

O(n) time, O(n) stack and output.

## Edge cases and Java 8 mistakes

Large n can exhaust Java recursion; an iterative loop avoids stack usage.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[Hello, Hello, Hello]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

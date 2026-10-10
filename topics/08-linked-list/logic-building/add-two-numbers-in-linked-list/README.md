# Add two numbers in Linked List

## Problem and contract

Each list represents a nonnegative integer with LEAST-significant digit first. Return a new list for their sum; inputs are not modified.

## Approach

Add corresponding digits plus carry; output sum%10 and propagate sum/10. Missing digits act as zero; a final carry needs one more node.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

342+465=807: 2+5=7; 4+6=10 gives 0 carry 1; 3+4+1=8.

## Complexity

O(max(n,m)) time and output space; O(1) auxiliary state.

## Edge cases and Java 8 mistakes

This digit order differs from Add One. Empty plus empty returns an empty representation of zero.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[7, 0, 8]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

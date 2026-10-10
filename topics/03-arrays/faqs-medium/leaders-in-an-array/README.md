# Leaders in an Array

## Problem and contract

A leader is STRICTLY greater than every value to its right. Return leaders in original order.

## Approach

Scan from the right while maintaining the largest right-side value. A value is a leader exactly when it beats that maximum.

## Other approaches

Brute force checks every right suffix in O(n²) time.

## Dry run

From right: keep 2, keep 5, skip 3 and 4, keep 17, skip 16; reverse kept list.

## Complexity

O(n) time; O(number of leaders) output space.

## Edge cases and Java 8 mistakes

Some platforms use >= rather than >; this contract is strict. Long.MIN_VALUE allows Integer.MIN_VALUE to be a leader.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[17, 5, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

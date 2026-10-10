# Asteroid Collision

## Problem and contract

Nonzero signed asteroids move right if positive, left if negative. Colliding smaller magnitude disappears; equal magnitudes both disappear.

## Approach

Only a positive survivor immediately before an incoming negative can collide. Pop smaller positives repeatedly; stop when the incoming asteroid dies or no collision pair remains.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Incoming -5 meets 10 and dies; 5 and 10 stay in original order.

## Complexity

O(n) amortized time; O(n) space.

## Edge cases and Java 8 mistakes

Abs(MIN_VALUE) needs long. Negative followed by positive moves apart and never collides.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[5, 10]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

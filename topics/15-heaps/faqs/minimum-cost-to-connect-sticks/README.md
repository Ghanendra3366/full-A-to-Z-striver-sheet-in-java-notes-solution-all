# Minimum Cost to Connect Sticks

## Problem and contract

Joining two nonnegative stick lengths costs their sum and creates one new stick; minimize total.

## Approach

Always merge the two shortest. The optimal merge-tree exchange argument places the two smallest leaves deepest as siblings; collapsing them reduces to the same smaller problem.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

2+3=5 costs 5, then 4+5=9 costs 9, total 14.

## Complexity

O(n log n) time; O(n) heap space.

## Edge cases and Java 8 mistakes

Zero/singleton input costs zero. Use long for joined lengths and cost; extremely large aggregate cost may require BigInteger.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
14
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

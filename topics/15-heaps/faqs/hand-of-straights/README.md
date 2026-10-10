# Hand of Straights

## Problem and contract

Partition all cards into groups of exactly group consecutive integer values, counting duplicates.

## Approach

The smallest remaining card must start some group: nothing smaller remains to precede it. Remove one of each required consecutive value, repeat.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Groups [1,2,3],[2,3,4],[6,7,8] consume all cards.

## Complexity

O(n log u) time; O(u) space.

## Edge cases and Java 8 mistakes

Check total divisibility first; value arithmetic uses long to reject range overflow.

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

[Curriculum index](../../../../curriculum/COVERAGE.md)

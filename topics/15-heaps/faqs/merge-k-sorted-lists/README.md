# Merge K sorted Lists

## Problem and contract

Merge k disjoint sorted next chains by relinking nodes.

## Approach

Heap holds one front per nonempty chain. The smallest front is globally smallest among remaining entries; after taking it insert only its successor.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Heap initially 1,2,3; polling 1 inserts 4, then polling 2 inserts 5.

## Complexity

O(N log(k+1)) time; O(k) heap space.

## Edge cases and Java 8 mistakes

Shared nodes or cycles violate the contract and could duplicate nodes or create loops.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3, 4, 5, 6]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

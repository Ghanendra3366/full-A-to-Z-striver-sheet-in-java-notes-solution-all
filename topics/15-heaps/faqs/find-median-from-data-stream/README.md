# Find Median from Data Stream

## Problem and contract

After each insertion return the median of all seen values; no value exists before the first insertion.

## Approach

Max-heap low contains the smaller half; min-heap high the larger. Keep low the same size or one larger and every low value<=every high value. Middle value(s) are the roots.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

After 1,2 roots are 1 and 2 ->1.5; after 3 low root 2 ->2.

## Complexity

O(log n) insertion, O(1) median; O(n) storage.

## Edge cases and Java 8 mistakes

Widen before averaging roots to avoid int overflow. Heap iterators do not give sorted order.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1.5
2.0
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

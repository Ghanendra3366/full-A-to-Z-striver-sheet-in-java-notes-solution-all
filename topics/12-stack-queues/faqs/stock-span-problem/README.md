# Stock span problem

## Problem and contract

Online span counts consecutive days ending today whose price<=today, including today.

## Approach

Maintain decreasing prices with compressed span counts. Every popped block is entirely dominated by the incoming price, so add its span to the new block.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

75 absorbs 60,70 and their prior covered 60 to get span four.

## Complexity

O(1) amortized per next, O(n) worst single call; O(n) storage.

## Edge cases and Java 8 mistakes

Equal prices are included and must pop with <=, not <.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 1, 1, 2, 1, 4, 6]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

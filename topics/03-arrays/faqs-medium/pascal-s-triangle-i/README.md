# Pascal's Triangle I

## Problem and contract

Return an entry using ONE-based row and column coordinates.

## Approach

Row r column c equals C(r-1,c-1). The multiplicative formula keeps exact intermediate binomial values.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Row 5 is [1,4,6,4,1]; column 3 is C(4,2)=6.

## Complexity

O(min(c-1,r-c)) BigInteger multiply/divide operations; storage grows with result bits.

## Edge cases and Java 8 mistakes

Do not mix one-based coordinates with zero-based combinatorial parameters.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
6
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Pascal's Triangle II

## Problem and contract

Return the whole ONE-based row as exact BigIntegers.

## Approach

Start from C(n,0)=1 and use C(n,k+1)=C(n,k)*(n-k)/(k+1). The division is exact.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

1 -> 1*4/1=4 -> 4*3/2=6 -> 6*2/3=4 -> 4*1/4=1.

## Complexity

O(row) BigInteger arithmetic operations and O(row) output values; bit cost depends on row.

## Edge cases and Java 8 mistakes

row=1 returns [1]. Large rows overflow int/long, hence BigInteger.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 4, 6, 4, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

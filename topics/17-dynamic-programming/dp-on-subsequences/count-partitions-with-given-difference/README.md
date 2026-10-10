# Count partitions with given difference

## Problem and contract

Count assignments of every nonnegative entry to two labeled sides with s1-s2=difference; Target sum interprets these as + and - signs.

## Approach

s1+s2=total and s1-s2=d imply s2=(total-d)/2. If that is not an integer in [0,total], return zero; otherwise count positional subsets for the minus side.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

For five ones and difference3, choose any one as minus and four as plus: five assignments.

## Complexity

O(n*derivedTarget) BigInteger additions and O(derivedTarget) values.

## Edge cases and Java 8 mistakes

Zeros double assignments. Negative difference is allowed; labeled partitions/sign assignments are not unordered partitions.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Coin change II

## Problem and contract

Count unordered combinations of unlimited DISTINCT positive coin denominations summing to target; exact BigInteger.

## Approach

Process coin types outside and sums ascending inside, so each combination is counted once by its last processed type. Reversing loops would count ordered sequences.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Target5: five1s, three1s+2, one1+two2s, or one5 ->four.

## Complexity

O(coins*target) BigInteger additions; O(target) stored values.

## Edge cases and Java 8 mistakes

Validate nonnegative size/target parameters and respect the stated input domain. Java array dimensions must fit memory; recursion alternatives may exhaust the call stack.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

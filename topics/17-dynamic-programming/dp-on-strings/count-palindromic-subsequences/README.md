# Count Palindromic Subsequences

## Problem and contract

Count NONEMPTY positional palindromic subsequences, counting equal values at different indices separately. Exact BigInteger.

## Approach

Different endpoints: add counts excluding either endpoint and subtract doubly counted middle. Equal endpoints: the newly wrapped middle subsequences and endpoint pair replace the subtraction, simplifying to left+right+1.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

aaa has three singletons,three pairs,and one triple =seven.

## Complexity

O(n²) BigInteger additions/subtractions and stored values.

## Edge cases and Java 8 mistakes

This is not count of distinct palindrome VALUES (aaa has only three distinct values). That variant needs next/previous equal-character bounds.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
7
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Palindrome partitioning II

## Problem and contract

Minimum cuts partitioning the whole string into palindromic substrings; empty input zero.

## Approach

Precompute palindrome intervals. parts[i]=min1+parts[j+1] over palindromic prefixes s[i..j]; number of cuts is parts-1.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

aa|b uses two parts, hence one cut.

## Complexity

O(n²) time/space.

## Edge cases and Java 8 mistakes

Subtract one only for nonempty strings; otherwise the empty suffix base would produce -1.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

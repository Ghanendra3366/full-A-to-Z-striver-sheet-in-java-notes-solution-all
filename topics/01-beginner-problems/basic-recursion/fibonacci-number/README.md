# Fibonacci Number

## Problem and contract

Return F(n), F(0)=0 and F(1)=1, for 0<=n<=92.

## Approach

Keep two consecutive terms. This removes repeated subproblems from the recursion tree. The unused successor after F(92) may wrap, but the returned F(92) is exact.

## Other approaches

The iterative equivalent avoids recursive stack space. Fibonacci naive recursion is exponential; memoization uses O(n) time and O(n) space.

## Dry run

Pairs (0,1),(1,1),(1,2),...,(55,89).

## Complexity

O(n) time and O(1) space.

## Edge cases and Java 8 mistakes

Java 8 does not optimize tail calls. Deep recursion can cause StackOverflowError; use an iterative equivalent for large inputs. Validate helper indices before calling.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
55
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

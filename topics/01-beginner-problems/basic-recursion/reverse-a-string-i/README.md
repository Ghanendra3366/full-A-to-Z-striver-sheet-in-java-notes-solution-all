# Reverse a String I

## Problem and contract

Reverse a UTF-16 string recursively for educational purposes.

## Approach

First character becomes the last; recursively reverse the suffix.

## Other approaches

The iterative equivalent avoids recursive stack space. Fibonacci naive recursion is exponential; memoization uses O(n) time and O(n) space.

## Dry run

java -> reverse(ava)+j -> avaj.

## Complexity

O(n²) time and allocated substring/concatenation storage; O(n) recursion depth.

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
avaj
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

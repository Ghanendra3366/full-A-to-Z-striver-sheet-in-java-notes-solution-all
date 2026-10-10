# Check if String is Palindrome or Not

## Problem and contract

Exact case-sensitive palindrome check with an inclusive interval.

## Approach

The outer characters must match and the inner interval must be a palindrome.

## Other approaches

The iterative equivalent avoids recursive stack space. Fibonacci naive recursion is exponential; memoization uses O(n) time and O(n) space.

## Dry run

l,e match their opposite ends; middle v is a base case.

## Complexity

O(n) time and O(n) stack.

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
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

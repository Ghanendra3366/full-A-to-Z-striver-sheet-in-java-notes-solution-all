# Factorial of a Given Number

## Problem and contract

Compute factorial recursively and exactly.

## Approach

n!=n*(n-1)! with 0!=1 and 1!=1.

## Other approaches

The iterative equivalent avoids recursive stack space. Fibonacci naive recursion is exponential; memoization uses O(n) time and O(n) space.

## Dry run

5*4*3*2*1=120.

## Complexity

O(n) recursive calls; O(n) stack frames plus BigInteger storage and multiplication cost.

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
120
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

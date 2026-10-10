# Sum of First N Numbers

## Problem and contract

Sum 1 through n for n>=0.

## Approach

solve(n)=n+solve(n-1), base solve(0)=0.

## Other approaches

The iterative equivalent avoids recursive stack space. Fibonacci naive recursion is exponential; memoization uses O(n) time and O(n) space.

## Dry run

5+4+3+2+1+0=15.

## Complexity

O(n) time and O(n) call stack.

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
15
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

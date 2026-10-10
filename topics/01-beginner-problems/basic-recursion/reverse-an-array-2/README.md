# Reverse an array 2

## Problem and contract

Reverse in place; start with endpoints 0,length-1.

## Approach

Swap endpoints and recurse on the interval between them.

## Other approaches

The iterative equivalent avoids recursive stack space. Fibonacci naive recursion is exponential; memoization uses O(n) time and O(n) space.

## Dry run

[1,2,3] -> [3,2,1]; central index terminates.

## Complexity

O(n) time and stack.

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
[3, 2, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

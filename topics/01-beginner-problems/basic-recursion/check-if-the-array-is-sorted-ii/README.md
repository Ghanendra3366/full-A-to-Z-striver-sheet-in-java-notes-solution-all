# Check if the Array is Sorted II

## Problem and contract

Check nondecreasing order recursively, starting at index zero.

## Approach

Each adjacent pair must be ordered; recurse to validate the remaining pairs.

## Other approaches

The iterative equivalent avoids recursive stack space. Fibonacci naive recursion is exponential; memoization uses O(n) time and O(n) space.

## Dry run

1<=2 and 2<=2, then no pair remains.

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
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

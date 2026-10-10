# Check if a Number is Prime or Not

## Problem and contract

Recursive trial division; call with d=2.

## Approach

Stop after sqrt(n); otherwise reject a divisor and recurse with the next candidate.

## Other approaches

The iterative equivalent avoids recursive stack space. Fibonacci naive recursion is exponential; memoization uses O(n) time and O(n) space.

## Dry run

Candidates 2 through 9 fail to divide 97.

## Complexity

O(sqrt(n)) time and stack.

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

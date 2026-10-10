# Valid Paranthesis Checker

## Problem and contract

For (,),* where * may be (,),or empty, decide if some replacement gives balanced parentheses.

## Approach

Track a RANGE of possible open counts. * expands low down/high up; clamp low to zero because negative opens are invalid. If high becomes negative, every interpretation fails. At the end zero must be in the range.

## Other approaches

Trying all three meanings of every star is O(3^stars). DP memoizes index/open states.

## Dry run

(*)): ranges [1,1] -> [0,2] -> [0,1] -> [0,0].

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

This is the wildcard-parentheses variant; ordinary bracket matching uses a stack.

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

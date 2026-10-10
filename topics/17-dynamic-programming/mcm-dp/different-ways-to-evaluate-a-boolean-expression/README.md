# Different Ways to Evaluate a Boolean Expression

## Problem and contract

Operands T/F alternating binary &,|,^; count parenthesizations evaluating TRUE, exact BigInteger.

## Approach

State(interval,truthValue). Split at every operator and combine all four left/right truth pairs, multiplying independent counts into the appropriate truth result.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Four of the five parenthesizations of T|T&F^T evaluate true.

## Complexity

O(n³) BigInteger multiply/add operations, O(n²) stored counts for n operands.

## Edge cases and Java 8 mistakes

This counts parenthesizations, not assignments to variable symbols. Operator evaluation follows each chosen parenthesization, overriding ordinary precedence.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

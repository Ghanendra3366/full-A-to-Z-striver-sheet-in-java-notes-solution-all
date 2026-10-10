# Factorial of a given number

## Problem and contract

Compute n! exactly for n >= 0, including 0! = 1.

## Approach

Multiply 2 through n; after i, the accumulator is i!. BigInteger keeps the result exact.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

4!: 1 -> 2 -> 6 -> 24.

## Complexity

n-1 multiplications; bit complexity and space grow with the output size, so this is not O(1) space for arbitrary n.

## Edge cases and Java 8 mistakes

int overflows after 12!; long after 20!. Reject negative inputs.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2432902008176640000
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

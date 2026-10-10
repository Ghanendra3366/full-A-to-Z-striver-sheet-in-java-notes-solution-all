# Generate Parentheses

## Problem and contract

Generate all balanced strings with n opening and n closing parentheses; n=0 yields one empty string.

## Approach

Only add an opening when open<n, and a closing when close<open. These conditions ensure no invalid prefix is generated; every balanced string follows one such path.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

At n=2 paths are (()) and ()(); trying to close at the initial state is forbidden.

## Complexity

O(n*C_n) time/output space where C_n is the nth Catalan number; O(n) recursion/path space.

## Edge cases and Java 8 mistakes

Restore the builder after each branch. The returned list is exponential; large n cannot be enumerated practically.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[((())), (()()), (())(), ()(()), ()()()]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

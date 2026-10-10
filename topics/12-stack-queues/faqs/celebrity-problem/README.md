# Celebrity Problem

## Problem and contract

A celebrity knows nobody else and is known by everybody else; return index or -1.

## Approach

If candidate knows i, candidate cannot be celebrity, so replace with i. Otherwise i cannot be celebrity. One candidate survives; verify both defining conditions.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Candidate 0 knows 1 -> candidate becomes 1; all others know 1, and 1 knows none.

## Complexity

O(n) matrix queries and O(1) space excluding input.

## Edge cases and Java 8 mistakes

Elimination alone is insufficient; the verification pass is mandatory. Diagonal values are ignored.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
1
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Wildcard matching

## Problem and contract

Match the WHOLE text; ? matches one character, * matches any sequence including empty.

## Approach

For *, either skip the star (current row left) or let it consume a text character (prior row same column). Other matches consume one character on each side.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

* before a can match empty; middle * consumes dce; final b matches b.

## Complexity

O(n*m) time, O(m) space.

## Edge cases and Java 8 mistakes

This is wildcard matching, not regex; regex * repeats a preceding element instead.

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

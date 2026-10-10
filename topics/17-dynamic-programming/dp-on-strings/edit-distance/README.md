# Edit distance

## Problem and contract

Minimum unit-cost insert,delete,replace operations converting a to b.

## Approach

Equal last characters cost no new operation; otherwise take1+min(replace diagonal,delete above,insert left). Empty-prefix cost equals its length.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

horse ->rorse (replace h), ->rose (delete r), ->ros (delete e): three.

## Complexity

O(n*m) time, O(m) space.

## Edge cases and Java 8 mistakes

Validate nonnegative size/target parameters and respect the stated input domain. Java array dimensions must fit memory; recursion alternatives may exhaust the call stack.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

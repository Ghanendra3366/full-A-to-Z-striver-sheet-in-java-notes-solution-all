# Remove Outermost Parentheses

## Problem and contract

Remove the outer pair of each primitive component of a balanced parentheses string.

## Approach

Opening at depth zero and closing to depth zero delimit a primitive and are omitted; interior characters are kept.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

(()()) contributes ()(); (()) contributes ().

## Complexity

O(n) time, O(n) result space.

## Edge cases and Java 8 mistakes

A primitive has no proper nonempty balanced prefix. Reject malformed input rather than returning a misleading partial string.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
()()()
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

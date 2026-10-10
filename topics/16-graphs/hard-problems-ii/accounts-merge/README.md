# Accounts merge

## Problem and contract

Each account is [name,emails...]. Shared emails imply same person transitively; output merged groups with sorted unique emails.

## Approach

Map each email to its first owner and union later owners. Group email keys by final representative, then sort within each group.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(totalEmails*alpha(accounts)+totalEmails log totalEmails) time; O(accounts+emails) space.

## Edge cases and Java 8 mistakes

Same-name alone does not imply same person. Accounts sharing an email are assumed to have consistent names; name-only accounts are preserved separately.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[John, a@mail, b@mail, c@mail]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

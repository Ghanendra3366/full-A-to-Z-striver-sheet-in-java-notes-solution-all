# Longest Substring With At Most K Distinct Characters

## Problem and contract

Return maximum substring length using at most k distinct UTF-16 characters.

## Approach

Maintain counts, shrinking only while type count exceeds k. After shrinking, current left is the earliest feasible start for this right endpoint.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

ece has two types and length 3; b requires dropping through the first c.

## Complexity

Expected O(n) time; O(min(n,k+1)) space.

## Edge cases and Java 8 mistakes

Remove zero-count keys, otherwise map.size does not reflect active types.

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

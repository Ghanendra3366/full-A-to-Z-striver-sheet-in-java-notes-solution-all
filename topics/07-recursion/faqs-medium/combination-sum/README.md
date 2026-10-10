# Combination Sum

## Problem and contract

Find unique nondecreasing combinations summing to target, with positive candidates. Each candidate may be reused.

## Approach

Sort candidates, skip duplicate siblings, and append values only at/after start. Recurse at i for reuse. This makes combinations canonical and avoids permutation duplicates.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For target 7, reusing 2 gives 2+2+3; candidate 7 gives a singleton. Without reuse only [7] is possible.

## Complexity

Exponential output-sensitive time; O(target/minCandidate) recursion depth for reuse, O(n) without reuse, plus sorted copy/output.

## Edge cases and Java 8 mistakes

Zero candidates would create infinite reuse recursion; reject nonpositive values. A remaining target of zero yields one completed combination.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[2, 2, 3], [7]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

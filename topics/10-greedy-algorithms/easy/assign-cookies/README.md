# Assign Cookies

## Problem and contract

Each child needs one cookie of at least its greed value; each cookie serves at most one child. Maximize satisfied children.

## Approach

Sort both lists. Give the smallest sufficient cookie to the least greedy remaining child. An exchange replacing a larger cookie with this one cannot hurt the child and preserves larger cookies for others.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Cookie 1 satisfies greed 1; second cookie 1 cannot satisfy greed 2.

## Complexity

O(n log n+m log m) time; O(n+m) copy space.

## Edge cases and Java 8 mistakes

Arrays are copied; zero children/cookies is valid. Values are assumed nonnegative.

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

[Curriculum index](../../../../COVERAGE.md)

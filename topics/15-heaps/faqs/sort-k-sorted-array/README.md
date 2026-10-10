# Sort K sorted array

## Problem and contract

Every value is at most k positions from its final sorted location. Sort in place.

## Approach

The next smallest value must lie in the next k+1 unread/queued candidates. Poll one, then add the next unread value.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

First candidates 3,1,2 emit 1; insert 5, emit 2; insert 4, then emit 3,4,5.

## Complexity

O(n log(min(n,k+1)+1)) time; O(min(n,k+1)) heap space.

## Edge cases and Java 8 mistakes

Without the k-displacement promise a small heap may produce an incorrect sort. k=0 expects already sorted input.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3, 4, 5]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

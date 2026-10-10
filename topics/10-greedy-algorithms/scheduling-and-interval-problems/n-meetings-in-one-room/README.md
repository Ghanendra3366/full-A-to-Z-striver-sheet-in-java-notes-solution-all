# N meetings in one room

## Problem and contract

Maximize nonoverlapping meetings [start,end]. This variant requires the next start STRICTLY after the previous end.

## Approach

Always choose the earliest finishing compatible meeting. Replacing an optimal first choice with this earlier finisher leaves at least as much time for remaining meetings.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Choose [1,2],[3,4],[5,7],[8,9].

## Complexity

O(n log n) time; O(n) copy space.

## Edge cases and Java 8 mistakes

Some judges allow touching endpoints; change > to >= for that contract. Equal finish times are harmless to count.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

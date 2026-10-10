# Trapping Rainwater

## Problem and contract

Nonnegative bar heights of unit width; compute total trapped water.

## Approach

Process the side with the smaller established boundary maximum. Its water level is already limited by that side regardless of unknown interior heights; add max-height and advance.

## Other approaches

Prefix/suffix maxima use O(n) space; checking boundaries per bar uses O(n²) time.

## Dry run

Valleys between left/right barriers accumulate six units in the standard example.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Return long. Empty input holds zero water.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
6
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

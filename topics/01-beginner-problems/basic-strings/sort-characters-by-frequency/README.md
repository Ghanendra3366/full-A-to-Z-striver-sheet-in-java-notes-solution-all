# Sort Characters by Frequency

## Problem and contract

Sort character groups by descending frequency; ties by ascending UTF-16 character value.

## Approach

Count, sort distinct characters by the contract comparator, then repeat each character its count.

## Other approaches

Frequency buckets can produce O(n+u) time but need explicit tie ordering if required.

## Dry run

e:2, r:1, t:1 -> ee then r then t.

## Complexity

Expected O(n+u log u) time; O(n+u) space.

## Edge cases and Java 8 mistakes

Tie-breaking makes output deterministic. Comparator subtraction can overflow for large integer counts; use compare.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
eert
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

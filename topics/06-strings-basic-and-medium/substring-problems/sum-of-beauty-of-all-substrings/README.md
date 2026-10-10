# Sum of Beauty of All Substrings

## Problem and contract

For lowercase a..z, beauty of a substring is largest minus smallest POSITIVE frequency. Sum over all nonempty substrings.

## Approach

For each left boundary extend right, updating counts. Scan the fixed alphabet for frequency extrema; this avoids recounting the substring from scratch.

## Other approaches

Recounting every substring from scratch takes O(n³) time.

## Dry run

Zero-frequency letters do not affect the minimum; otherwise even a single-character string would incorrectly have positive beauty.

## Complexity

O(26*n²) time; O(26) auxiliary space.

## Edge cases and Java 8 mistakes

Use long total. Nonlowercase input is rejected.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# String to Integer (atoi)

## Problem and contract

Skip leading ASCII spaces, accept one optional sign, read consecutive decimal digits, and clamp to signed int range. No digits yields zero.

## Approach

Accumulate magnitude. Before multiplying by ten, compare with (limit-digit)/10 so even very long strings cannot overflow the accumulator.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Skip spaces, read -, accumulate 4 then 42, stop at the following space.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Negative magnitude permits 2147483648; positive permits only 2147483647. Two signs or a nondigit before digits produce zero.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
-42
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

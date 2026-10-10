# Set the i-th Bit

## Problem and contract

Modify one zero-based bit in the signed 32-bit pattern and return the new pattern.

## Approach

OR sets, AND with an inverted mask clears, XOR toggles the addressed bit, leaving all others unchanged.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

10 is1010; set bit2 ->1110; clear/toggle bit1 ->1000.

## Complexity

O(1) time/space.

## Edge cases and Java 8 mistakes

Validate index because Java shifts mask counts modulo32; bit31 may make the returned int negative.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
14
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Divide two numbers without multiplication and division

## Problem and contract

Compute quotient truncating toward zero without multiplication, division or remainder. Clamp the sole int-overflow quotient to MAX_VALUE.

## Approach

Subtract the largest fitting power-of-two multiple of divisor at each bit from high to low; set that quotient bit. The remainder decreases while the reconstructed quotient accounts for every subtraction.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

43-32 leaves 11 and sets quotient bit 2; 11-8 leaves 3 and sets bit 0; quotient 5, sign makes -5.

## Complexity

32 iterations: O(1) for fixed-width inputs, O(1) space.

## Edge cases and Java 8 mistakes

Cast before abs to handle MIN_VALUE. b<<31 fits long for int magnitudes.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
-5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

# Maximum XOR of two numbers in an array

## Problem and contract

For nonnegative ints find maximum XOR from two distinct array positions. Fewer than two entries returns zero.

## Approach

Store earlier numbers in a binary trie. At each high-to-low bit prefer the opposite branch; the highest gained bit outweighs every possible loss below it. Query before inserting current to enforce distinct indices.

## Other approaches

Pair enumeration takes O(n²) time and O(1) space.

## Dry run

5 XOR 25 = 28, binary 11100.

## Complexity

O(31*n) time/space; 31 is a fixed-width bound.

## Edge cases and Java 8 mistakes

This trie optimizes nonnegative int XOR; arbitrary signed maximum requires a sign-bit-aware ordering contract.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
28
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

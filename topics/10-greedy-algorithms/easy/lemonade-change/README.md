# Lemonade Change

## Problem and contract

A drink costs 5. Customers pay 5,10,20 in order; start with no cash and return whether every change can be made.

## Approach

For a 20 bill prefer 10+5 over 5+5+5 because fives are the only way to change a future 10. Twenties never help make change.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Three fives -> one ten consumes a five -> twenty uses ten+five.

## Complexity

O(n) time; O(1) space.

## Edge cases and Java 8 mistakes

Future bills cannot pay current change; do not aggregate the whole queue first.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

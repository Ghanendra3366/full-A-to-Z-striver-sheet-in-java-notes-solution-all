# Check for balanced binary tree

## Problem and contract

Every node's two subtree heights must differ by at most one.

## Approach

Return height when balanced, or -1 sentinel for imbalance. Postorder computes each child height once and propagates failure.

## Other approaches

Recomputing subtree height at each node is O(n²) worst time.

## Dry run

Sample child heights are equal at every internal node.

## Complexity

O(n) time, O(h) stack.

## Edge cases and Java 8 mistakes

Checking only root balance is insufficient.

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

[Curriculum index](../../../../curriculum/COVERAGE.md)

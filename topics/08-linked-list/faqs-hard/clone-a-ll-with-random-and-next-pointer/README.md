# Clone a LL with random and next pointer

## Problem and contract

Deep-copy an acyclic next chain whose random pointers are null or point within that chain. Restore original next links.

## Approach

Interleave each copy after its original. Then original.random.next is the corresponding copied random target. Finally separate original and copied chains.

## Other approaches

A map original->copy supports a simpler O(n)-space two-pass implementation.

## Dry run

A->A'->B->B'; A'.random is B', B'.random is A'; split back into two chains.

## Complexity

O(n) time; O(1) auxiliary space excluding O(n) new output nodes.

## Edge cases and Java 8 mistakes

Random references must lie inside the chain. The method temporarily mutates original next links, so concurrent traversal is unsafe.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2]
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)

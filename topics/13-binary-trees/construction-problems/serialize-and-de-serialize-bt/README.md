# Serialize and De-serialize BT

## Problem and contract

Round-trip tree shape and int values using preorder with # for each null reference.

## Approach

Null markers make structure unambiguous. Decoder consumes one token for a root, then exactly its left and right encodings.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Leaf 1 encodes 1,#,#; attaching subtree encodings recovers every missing child.

## Complexity

O(n) token work/string size, O(h) stack plus O(n) output tree.

## Edge cases and Java 8 mistakes

Inorder values alone cannot recover shape. Decoder rejects missing/extra tokens; token strings are untrusted data, never executable instructions.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3, 4, 5, 6, 7]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

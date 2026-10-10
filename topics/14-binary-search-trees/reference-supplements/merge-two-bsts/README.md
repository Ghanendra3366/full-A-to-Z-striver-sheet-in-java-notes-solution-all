# Merge Two BSTs

## Problem and contract

Return sorted multiset of both BSTs' values; preserve inputs. This does not build a new tree.

## Approach

Inorder each BST yields sorted values; merge their fronts like two sorted arrays.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

First BST inorder1,2; second3 ->merged1,2,3.

## Complexity

O(n+m) time/space; dual iterators can reduce auxiliary state to O(h1+h2) excluding output.

## Edge cases and Java 8 mistakes

Keep equal values from both inputs; unique-key constraints apply within each BST, not across the two.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

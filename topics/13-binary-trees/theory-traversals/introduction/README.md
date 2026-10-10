# Introduction

Binary tree nodes have value, left and right references; either child may be null. Root has no parent. Height here counts nodes on a longest downward path; empty height is zero. Depth counts edges from root. A tree has no cycles or shared child nodes. Traversals visit every node in O(n): preorder root-left-right, inorder left-root-right, postorder left-right-root, level order breadth-first. General binary trees have no sorted-key property. Recursive traversals use O(h) call stack, possibly O(n) for a chain.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Introduction to BST

A strict BST has every left-subtree value smaller than its root and every right-subtree value larger. This repository uses distinct keys. Inorder traversal is therefore strictly increasing. Search descends only one branch, taking O(h) time where h is height; a skewed tree has h=n, so ordinary BST operations are not automatically logarithmic. Balanced search trees such as TreeMap maintain logarithmic height. Null means an empty tree. Checking only immediate children is insufficient: every descendant must respect all ancestor bounds.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Requirements needed to construct a unique BT

With DISTINCT labels, inorder plus preorder or inorder plus postorder uniquely determines a binary tree. Root comes from preorder first or postorder last; its inorder position divides left/right labels. Preorder plus postorder generally does not identify whether a lone child is left or right, so it is not unique without extra structural assumptions (such as full binary tree). Duplicate labels break unique index lookup and may admit multiple trees. Level order alone is also insufficient. Validate traversal lengths, labels and consistent subtree ranges; do not silently construct from mismatched inputs.

[Curriculum index](../../../../curriculum/COVERAGE.md)

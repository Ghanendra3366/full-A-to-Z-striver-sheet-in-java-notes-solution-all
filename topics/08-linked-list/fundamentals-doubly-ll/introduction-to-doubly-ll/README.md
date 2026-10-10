# Introduction to Doubly LL

A node stores a value and a next reference; a doubly node also stores prev. Head is a reference to the first node, null for empty. These linked-list lessons use a shared teaching Node with optional random/bottom fields; only the links needed by the operation are meaningful. Arrays give O(1) indexed access, lists require O(n) traversal. Inserting/deleting at a known predecessor is O(1), but locating position k is O(n). Always save the suffix before overwriting next and assign the returned head. Doubly splices update both directions. The concrete head, tail, kth, given-value and given-node lessons in this subsection contain executable implementations and worked examples. For DLL verification, additionally traverse backward from tail and check every reciprocal link.

[Curriculum index](../../../../COVERAGE.md)

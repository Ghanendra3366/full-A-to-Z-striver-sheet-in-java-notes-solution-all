# Heaps (Theory Video)

A binary heap is a complete tree stored in an array: children of i are 2*i+1 and 2*i+2; parent is (i-1)/2. Min-heap parent<=children makes root smallest but does NOT sort the whole array. Sift-down restores order after replacing a root; sift-up after appending a leaf. Bottom-up heap construction is O(n), since most nodes sit near the leaves. PriorityQueue is a Java 8 min-heap by default. Use Collections.reverseOrder for a max-heap. Its iterator is not sorted; poll repeatedly to obtain sorted priorities. Offer/poll take O(log n), peek O(1).

[Curriculum index](../../../../curriculum/COVERAGE.md)

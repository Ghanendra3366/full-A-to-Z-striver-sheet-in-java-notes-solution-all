# Learn All Patterns of Subsequences (Theory)

At index i, a positional subsequence either includes a[i] or skips it. Recurse on i+1 in both cases; the measure n-i decreases. A mutable path needs push -> recurse -> pop restoration. At i==n: print/copy the path for enumeration, return whether its sum matches for existence, or return 1/0 for counting. Existence can short-circuit with OR; counting adds both branches. Duplicated values still give distinct positional choices. Pruning sum>target is only safe when all remaining values are nonnegative. Worst case is 2^n leaves and O(n) stack, with additional output cost when copying paths.

[Curriculum index](../../../../curriculum/COVERAGE.md)

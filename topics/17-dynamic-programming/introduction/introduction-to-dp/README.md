# Introduction to DP

Dynamic programming applies when subproblems overlap and a state captures every fact needed for future choices. Start with a recursive state definition, write choices and base cases, memoize by the complete state, then order a table so dependencies are computed first. Space compression is valid only after identifying which earlier rows are still needed. Existence uses OR, optimization min/max, counting sums. Do not confuse an uncomputed state with a legitimate zero or negative answer. Use separate visited flags or a sentinel outside the result range. Prove optimal substructure: replacing a chosen subproblem solution by a better one must improve the complete solution. The lessons below state the recurrence and provide executable tabulated/rolling implementations; they describe memoized alternatives where appropriate. Not every alternative has a separate code implementation.

[Curriculum index](../../../../curriculum/COVERAGE.md)

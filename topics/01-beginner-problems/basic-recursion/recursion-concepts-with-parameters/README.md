# Recursion Concepts with Parameters

Parameters carry the subproblem state. For array sum, solve(a,i) means the sum of suffix [i,n); its base is i==n. Backtracking additionally restores mutated state after each choice. A global accumulator must be reset between calls; prefer returning values or passing explicit state.

[Curriculum index](../../../../curriculum/COVERAGE.md)

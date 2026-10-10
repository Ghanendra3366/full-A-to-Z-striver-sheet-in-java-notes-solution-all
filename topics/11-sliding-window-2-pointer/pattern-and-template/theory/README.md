# Theory

A sliding window maintains a contiguous interval [left,right]. Fixed-size windows add one entry and remove one each step. Variable windows expand right and shrink left until a monotone validity condition holds. Distinct-count, zero-count and nonnegative sums have useful monotonicity; arbitrary signed sums do not. For an at-most-k count, all suffixes of a valid window ending at right are valid, adding right-left+1. Exactly k often equals atMost(k)-atMost(k-1). A two-pointer proof counts total pointer moves: each pointer advances at most n times, even when a while loop is nested inside a for loop.

[Curriculum index](../../../../curriculum/COVERAGE.md)

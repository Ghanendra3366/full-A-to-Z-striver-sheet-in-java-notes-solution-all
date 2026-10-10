# Bit PreRequisites for TRIE Problems

A binary trie follows one edge per bit, from bit 31 down to 0. Extract via `(x >>> bit) & 1`, which works with signed patterns. To maximize XOR, prefer the opposite bit when a matching stored prefix exists. Greedy works because the highest differing bit contributes more than every lower bit combined. Define signed versus unsigned optimization explicitly: these lessons restrict numbers to nonnegative ints, so signed and unsigned ordering agree. Offline bound queries sort by bound and insert only eligible values before querying.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Hashing In Strings | Theory

Polynomial hash represents a sequence by a modular weighted sum. Prefix hashes plus powers permit O(1) substring-hash calculation after O(n) preprocessing. Equal hashes do NOT prove equal strings: collisions exist. Double hashing reduces accidental collisions but does not make equality exact. For exact matching verify candidate characters or use KMP/Z. Java long multiplication may overflow before modulo; choose a modulus/base whose intermediate product fits, or use an overflow-safe multiply. Normalize subtraction modulo a positive modulus. A rolling hash removes the outgoing high-order digit, multiplies by base, and adds the incoming digit.

[Curriculum index](../../../../curriculum/COVERAGE.md)

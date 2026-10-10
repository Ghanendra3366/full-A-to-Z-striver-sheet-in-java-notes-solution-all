# Basic String

Strings are immutable UTF-16 sequences in Java 8. charAt handles code units, not full Unicode code points. These interview solutions state ASCII/lowercase assumptions where applicable. Repeated `s += c` can become quadratic; use StringBuilder. Compare content using equals.

[Curriculum index](../../../../COVERAGE.md)

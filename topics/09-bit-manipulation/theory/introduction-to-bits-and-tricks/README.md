# Introduction to Bits and Tricks

An int has 32 bits in two's-complement form. `&` keeps common set bits, `|` combines bits, `^` differs bits, `~` flips bits. `1 << i` addresses bit i for 0<=i<32. Java masks shift distances modulo 32 for int and modulo 64 for long, so validate indices. `>>` sign-extends; `>>>` fills with zero. `n & (n-1)` clears the lowest set bit; `n & -n` isolates it. int bit patterns may be negative; interpret unsigned values with `Integer.toUnsignedLong` when needed.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Java Collections

ArrayList: indexed get O(1), append amortized O(1), middle insertion O(n). ArrayDeque: O(1) amortized push/pop/offer/poll, no null. HashMap/HashSet: expected O(1) lookup/update. TreeMap/TreeSet: O(log n), sorted keys. PriorityQueue: offer/poll O(log n), peek O(1). Use `Integer.compare(a,b)` rather than subtraction comparators that can overflow. Java 8 supports `getOrDefault`, `computeIfAbsent`, lambdas and diamond syntax. It does not support List.of, Map.of, records or var. Primitive arrays use Arrays.sort; object arrays can take comparators. Iterator.remove removes safely during iteration.

[Curriculum index](../../../../curriculum/COVERAGE.md)

# Theory with examples

Count input-dependent operations, not source lines. A single scan is O(n); nested scans usually O(n²); repeatedly halving an interval is O(log n). Sequential costs add and the largest term dominates. Recurrence merge sort: T(n)=2T(n/2)+O(n)=O(n log n). Space includes recursion frames; distinguish auxiliary space from returned output. HashMap operations are expected constant time, not an unconditional worst-case guarantee.

[Curriculum index](../../../../curriculum/COVERAGE.md)

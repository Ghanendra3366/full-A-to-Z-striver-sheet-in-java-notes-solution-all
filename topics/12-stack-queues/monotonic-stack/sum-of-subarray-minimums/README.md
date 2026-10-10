# Sum of Subarray Minimums

## Problem and contract

Sum every nonempty subarray's minimum, modulo 1e9+7. Values are nonnegative and aggregate contribution fits long under typical n<=30000,a[i]<=30000 bounds.

## Approach

Monotone stack assigns each index a previous strictly-smaller boundary and next smaller-or-equal boundary. That asymmetric tie rule gives each subarray one owning minimum. Its contribution is value*(left choices)*(right choices).

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

For 1 at index 1 in [3,1,2,4], left choices 2 and right choices 3 give contribution 6; all indices sum to 17.

## Complexity

O(n) time/space.

## Edge cases and Java 8 mistakes

Tie asymmetry prevents duplicate ownership. For unconstrained large values/lengths, reduce modular products during accumulation to avoid long overflow.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
17
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

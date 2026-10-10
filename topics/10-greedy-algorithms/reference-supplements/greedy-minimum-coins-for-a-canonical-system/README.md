# Greedy Minimum Coins for a Canonical System

## Problem and contract

Minimum coins for the explicitly fixed canonical denominations1,2,5,10,20,50,100. Return coins descending.

## Approach

Take the largest fitting denomination. For this decimal1/2/5 hierarchy, enough lower coins to replace a larger one can always be exchanged without using more coins; normalize these exchanges until the greedy counts remain.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

93=50+20+20+2+1, five coins.

## Complexity

O(number of returned coins+7) time/output; O(1) auxiliary state.

## Edge cases and Java 8 mistakes

Greedy is not valid for arbitrary denominations:1,3,4 target6 greedily uses4+1+1, while3+3 is optimal. Use the DP Minimum coins lesson for general systems. This is an algorithmic coin system, not a claim about current currency circulation.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[50, 20, 20, 2, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

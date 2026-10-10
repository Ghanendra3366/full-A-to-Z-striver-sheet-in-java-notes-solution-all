# Best time to buy and sell stock with transaction fees

## Problem and contract

Nonnegative daily prices; at most k completed transactions, one share held at once. This lesson uses unlimited (pass n/2), fee 2, cooldown false.

## Approach

State (day,holding,remainingSells). Not holding: max(skip,-price+holding tomorrow). Holding: max(skip,price-fee+notHolding after sell). A sell consumes one transaction; cooldown skips one subsequent day. Work backwards, retaining tomorrow and day-after states.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

On [7,1,5,3,6,4], one trade1->6 yields5; two trades1->5 and3->6 yield7; charging fee2 per sell leaves3. Cooldown forbids buying immediately after selling.

## Complexity

O(n*k) time, O(k) rolling space; k is capped at floor(n/2). Unlimited variants can use constant-state O(n) algorithms instead.

## Edge cases and Java 8 mistakes

For III pass k=2; IV takes arbitrary k. II/fees/cooldown use k=n/2 for unlimited trades. Fees are charged at SELL only. Bounds assume final holding has no positive salvage value.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)

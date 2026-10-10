# Validation and scope

The inventory contains 495 A2Z entries and 22 clearly identified reference supplements.
There are 474 independent Java programs and 43 theory lessons. No inventory entry is pending.

## Reproduce

Use a JDK on PATH and Python 3.8 or newer:

```sh
python tools/build_catalog.py
git diff --exit-code
python tools/verify.py
python tools/regression.py
python tools/audit.py
```

The generator requires no external Python packages. Each Java class is compiled in its
own output directory because every question deliberately uses the same class name.
The verifier compares each deterministic example against its documented expected output.
On JDK 9+ it uses `--release 8`; on JDK 8 it uses the native Java 8 compiler.

The 35 additional test suites use a fixed random seed and independent brute-force
references where practical. They cover sorting, negative prefix sums, duplicate linked
list pairs, list restoration and identity, overflow-sensitive pair counting, substring
search, window subsequences, monotonic contributions, zero-valued subset counting,
palindromic subsequences, LIS counting, multigraph bridges, articulation points,
Dijkstra versus Floyd-Warshall, and cache eviction. All 35 passed locally.

Local verification uses JDK 26 with Java 8 release targeting.
All 474 local compile and example-output checks passed with zero failures.
The generator also reproduced the committed topic tree without changes.
The GitHub workflow
separately runs on Temurin Java 8. A configured workflow does not itself establish a
successful remote run; inspect the repository's Actions tab for that result.

## Coverage limits

Coverage means that every explicit inventory item has an authored lesson or runnable
solution. It does not mean every conceivable algorithm variant is separately coded,
or that the 1,951-page reference PDF has been reproduced line by line. Alternative
approaches are explained in the question notes; named extra methods appear where provided.
Some titles vary across platforms, so each lesson states its exact contract and assumptions.
For example, coin-change counting differs from minimum coins, and counting palindromic
subsequences by positions differs from counting distinct resulting strings.

Examples and randomized suites provide practical evidence; they do not prove every
implementation correct for all possible inputs. Observe each lesson's input restrictions,
mutation rules and integer bounds. Online judges may require a different method signature.

Git commits group substantive topic work and verification improvements, use the configured
author identity, and retain real timestamps. GitHub decides contribution eligibility;
this repository does not manufacture activity on past or future dates.

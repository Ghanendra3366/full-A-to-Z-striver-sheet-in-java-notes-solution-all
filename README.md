# Striver A2Z — Java 8 notes and solutions

Topic → subsection → question folders, following the supplied Striver curriculum.
Explanations use English with Hinglish reasoning where helpful. Code is Java 8 compatible.

**This is a work in progress. The exact implemented/theory/pending counts are in
[COVERAGE.md](curriculum/COVERAGE.md). A listed pending problem is not a completed solution.**

## Clone and study

```sh
git clone https://github.com/Ghanendra3366/full-A-to-Z-striver-sheet-in-java-notes-solution-all.git
cd full-A-to-Z-striver-sheet-in-java-notes-solution-all
```

Start with the [curriculum index](curriculum/COVERAGE.md). Each implemented question has
its own README and standalone `Solution.java`, including a deterministic runnable example.
Open that question's folder, then:

```sh
javac Solution.java
java Solution
```

All questions deliberately use class `Solution` with no package, so **compile each
question separately**. They can be copied to an online judge after adapting the method
signature and removing the demo `main`. The demos are not stdin parsers.

## Learning route

1. [Beginner](topics/01-beginner-problems/README.md)
2. [Sorting](topics/02-sorting/README.md), [Arrays](topics/03-arrays/README.md), [Hashing](topics/04-hashing/README.md)
3. [Binary Search](topics/05-binary-search/README.md), [Strings](topics/06-strings-basic-and-medium/README.md)
4. [Recursion](topics/07-recursion/README.md), [Linked List](topics/08-linked-list/README.md), [Bits](topics/09-bit-manipulation/README.md)
5. [Greedy](topics/10-greedy-algorithms/README.md), [Sliding Window](topics/11-sliding-window-2-pointer/README.md), [Stacks / Queues](topics/12-stack-queues/README.md)
6. [Trees](topics/13-binary-trees/README.md), [BST](topics/14-binary-search-trees/README.md), [Heaps](topics/15-heaps/README.md)
7. [Graphs](topics/16-graphs/README.md), [DP](topics/17-dynamic-programming/README.md), [Tries](topics/18-tries/README.md)
8. [Advanced Strings](topics/19-strings-advanced-algo/README.md), [Maths](topics/20-maths/README.md)

Read the contract before the algorithm: tie-breaking, mutation, indexing and character
range vary between platforms. Every implemented note includes its approach, dry run,
complexity, edge cases and an expected output. Alternative approaches are described
where authored; this repo does not claim every possible approach is implemented.

## Verify or regenerate

Requires Python 3.8+ and a JDK. With JDK 9+, verification uses `javac --release 8`;
with JDK 8 it uses the native compiler.

```sh
python tools/build_catalog.py
python tools/verify.py
```

Authored source is in `tools/content/`; generated question folders are committed so
readers do not need Python to study or run a solution. See [CONTRIBUTING](CONTRIBUTING.md).

## Sources and attribution

- Curriculum: the user-supplied pasted list, preserved in [source-list.txt](curriculum/source-list.txt).
- Roadmap: [Striver's A2Z on takeUforward](https://takeuforward.org/prep-hub/strivers-a2z-dsa-sheet).
- Reference notes: *Striver A2Z Full Notes — all approaches included*, prepared by
  Vinay Kajla, Instagram `@Vinay.Kajla_`. The supplied PDF is read as a reference;
  it is not redistributed. These Java implementations and explanations are authored
  for this repository. The project is an independent study resource.

Binary Search's 32 titles were absent from the pasted expanded list; the index marks
them as editorial supplements. The reference PDF and pasted list describe different
versions of the roadmap; coverage is measured against the explicit 495-item inventory,
not against an assumed frozen version of Striver's website.

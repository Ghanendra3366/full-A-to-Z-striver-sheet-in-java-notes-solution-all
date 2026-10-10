# Contributing

Add or improve a complete question in `tools/content/`, then regenerate with
`python tools/build_catalog.py`. Use the title from `curriculum/manifest.json`.

Every solution needs an explicit contract, readable Java 8 code, a worked example,
reasoning about correctness, time and space costs, and edge cases. State limitations
such as lowercase ASCII, positive input, or input mutation. Never mark a problem
implemented merely because a folder exists.

Run `python tools/verify.py` before committing. For algorithm changes add meaningful
edge or differential checks, especially negatives, zeros, duplicates and overflow.
Prefer one coherent topic or correction per commit. Use your real Git author identity
and current timestamps. Do not make empty commits or split unrelated formatting lines
to inflate history.

If improving a generated README directly, also update its authoring entry; regeneration
would otherwise overwrite the edit. Keep third-party PDFs, credentials, build outputs
and local extraction files out of Git.

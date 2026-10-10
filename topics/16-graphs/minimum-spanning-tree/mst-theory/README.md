# MST theory

A spanning tree connects all V vertices using V-1 edges and no cycle. An MST minimizes total weight. If the graph is disconnected there is no spanning tree; algorithms may instead return a minimum spanning forest. Cut property: a minimum-weight edge across any cut can be included in an MST, because exchanging it for the edge an MST uses across that cut cannot increase weight. Kruskal sorts edges and accepts ones connecting separate components (DSU). Prim repeatedly adds the smallest edge connecting the built tree to an outside vertex. Negative edge weights are fine for MST. Directed graphs require different arborescence algorithms.

[Curriculum index](../../../../curriculum/COVERAGE.md)

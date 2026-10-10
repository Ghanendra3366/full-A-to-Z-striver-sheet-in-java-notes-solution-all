# Introduction to Graph

A graph consists of vertices and edges, directed or undirected, weighted or unweighted. These lessons use zero-based vertices. Adjacency lists use O(V+E) memory; matrices use O(V²). An undirected edge normally occurs in both adjacency lists. A traversal must restart from every unvisited vertex to cover disconnected components. BFS gives shortest edge distance in unweighted graphs; DFS explores reachability. Weighted shortest paths need algorithms selected by edge constraints: Dijkstra for nonnegative weights, DAG order for acyclic graphs, Bellman-Ford when negative weights occur. Cycles mean a visited structure is essential; do not apply tree traversal assumptions.

[Curriculum index](../../../../curriculum/COVERAGE.md)

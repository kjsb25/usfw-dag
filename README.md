### Summary:

- Implementations in SolutionService.java. The DAG scope is used to generate DAGS and problem sets.
- My initial thought was depth first search, as my mental picture of a dag looked like a binary tree with more branch possibilities.
    - Implemented at /solution/DFS/{numVertices}/{startingVertex}
- On further research, it looks like DAGs are a more well known concept
    - Removes the need for keeping track of what's been visited. Learned something new!
    - that's solution 2.
- The topographical sort and dynamic programming solution was discovered with too little time to implement, 
- I probably got a bit too invested making this a full web application, but I hadn't gotten to start fresh in awhile, so it made sense to dust off that skill.

### Assumptions

- Graph is fully connected (no stray nodes)
- DFS assumes a tree setup, which I suppose isn't gauranteed. 

### Questions:

1.  Does the solution work for larger graphs?
    - Yes, as long as they conform to the assumptions
2.  Can you think of any optimizations?
    - Memoizing the results of nodes could help for more complex graphs
3.  What’s the computational complexity of your solution?
    - Since DFS insists on visiting each node along each edge, it scales upward with both
    - O(vertexes+edges)
4.  Are there any unusual cases that aren't handled?

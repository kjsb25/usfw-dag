### Summary:

- Implementations in SolutionService.java. The DAG scope is used to generate DAGS and problem sets.
- My initial thought was depth first search, as my mental picture of a dag looked like a binary tree with more branch possibilities.
- On further research, it looks like DAGs are a more well known concept that have a solved solution using topographical mapping.
- I probably got a bit too invested making this a full web application, but I hadn't gotten to start fresh in awhile, so it made sense to dust off that skill.

### Assumptions

- Graph is fully connected (no stray nodes)
- Root node will be the starting point of the largest route. (May have been wrong about this)

### Questions:

1.  Does the solution work for larger graphs?
2.  Can you think of any optimizations?
3.  What’s the computational complexity of your solution?
4.  Are there any unusual cases that aren't handled?

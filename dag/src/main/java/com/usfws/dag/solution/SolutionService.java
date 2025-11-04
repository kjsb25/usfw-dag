package com.usfws.dag.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.usfws.dag.DAG.DAG;
import com.usfws.dag.DAG.Vertex;

@Service
public class SolutionService {

    public Integer depthFirstSearch(DAG dag, Integer startingVertex) {
        ArrayList<Integer> nodesSeen = new ArrayList<>();

        int output = dfsRecurse(dag, startingVertex, nodesSeen, 0);

        return output;

    }

    private Integer dfsRecurse(DAG dag, Integer node, ArrayList<Integer> nodesSeen, int currDepth) {
        nodesSeen.add(node);
        Vertex vertex = dag.getVertices().get(node - 1);
        int maximumDepth=currDepth;
        for (Integer destination : vertex.getDestinations()) {
            if (!nodesSeen.contains(destination)) {
                int currResult = dfsRecurse(dag, destination, nodesSeen, currDepth + 1);
                maximumDepth = Math.max(maximumDepth, currResult);
            }
        }
        return maximumDepth;

    }
}

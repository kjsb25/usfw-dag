package com.usfws.dag.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usfws.dag.DAG.DAG;
import com.usfws.dag.DAG.DagService;

@RestController
@RequestMapping(value = "/solution")
public class SolutionController {

    @Autowired
    private SolutionService solutionService;

    @GetMapping(value = "/{strategy}/{numVertices}/{startingVertex}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String viewRandom(@PathVariable Strategy strategy, @PathVariable Integer numVertices,@PathVariable Integer startingVertex) {
        if(startingVertex > numVertices){
            return "Bad input, start needs to be inside the graph.";
        }
        DAG dag = DagService.generateRandomDag(numVertices);

        int result=0;

        switch (strategy) {
            case DFS:
                result = this.solutionService.depthFirstSearch(dag, startingVertex);
        }

        String output = dag.toString();

        output += "\n\n\nLongest path from root node: "+ result;

        return output;
    }
}

package com.usfws.dag.DAG;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/dag")
public class DAGController {

    @GetMapping(value = "/random/{numVertices}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getRandomDag(@PathVariable Integer numVertices){
        return DagService.generateRandomDag(numVertices).toString();
    }

}

package com.usfws.dag.DAG;

import java.util.ArrayList;
import java.util.List;

class Vertex {
    int id;
    int numParents=0;
    List<Integer> destinations;

    public Vertex(int id) {
        this.destinations = new ArrayList<>();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getDestinations() {
        return destinations;
    }

    
    public void addDestination(int id) {
        this.destinations.add(id);
    }

    public void incrementParents(){
        this.numParents++;
    }

}

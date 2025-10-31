package com.usfws.dag.DAG;

import java.util.ArrayList;
import java.util.List;

public class DAG {
    private int vertexCount;
    private List<Vertex> vertices;

    public DAG(int numVertexes) {
        this.vertexCount = numVertexes;
        this.vertices = new ArrayList<>(numVertexes);
        for(int i=1;i<=numVertexes;i++){
            this.vertices.add(new Vertex(i));
        }
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public void setVertexCount(int vertexCount) {
        this.vertexCount = vertexCount;
    }

    public void addEdge(int source,int destination){
        this.vertices.get(source-1).addDestination(destination);
        this.vertices.get(destination-1).incrementParents();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    
        sb.append("=== Directed Acyclic Graph ===\n");
        sb.append("Vertices: ").append(vertexCount).append("\n");
        sb.append("\nVisual Representation:\n");
        sb.append("------------------------\n\n");
        
        // Print each vertex and its connections
        for (Vertex vertex : vertices) {
            int id = vertex.getId();
            List<Integer> destinations = vertex.getDestinations();
            
            if (destinations == null || destinations.isEmpty()) {
                // Vertex with no outgoing edges
                sb.append("    (").append(id).append(")\n");
                sb.append("\n");
            } else {
                // Vertex with outgoing edges
                sb.append("    (").append(id).append(")\n");
                for (int i = 0; i < destinations.size(); i++) {
                    if (i == destinations.size() - 1) {
                        // Last edge
                        sb.append("     └──> (").append(destinations.get(i)).append(")\n");
                    } else {
                        // Not last edge
                        sb.append("     ├──> (").append(destinations.get(i)).append(")\n");
                    }
                }
                sb.append("\n");
            }
        }
        
        sb.append("========================\n");
        
        return sb.toString();
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

}

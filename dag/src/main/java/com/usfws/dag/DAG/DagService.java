package com.usfws.dag.DAG;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class DagService {

    final static int maxDestinations=3;

    public static DAG generateRandomDag(int vertices){
        DAG dag = new DAG(vertices);
        Random r = new Random();

        //on each vertex
        for (int i = 1; i < vertices; i++) {
            //for each vertex after it, randomly assign an edge sometimes
            for(int j = i+1;j < vertices;j++){
                if(j == i+1 && dag.getVertices().get(j).numParents==0){
                    dag.addEdge(i, j);
                }
                if(r.nextBoolean()){
                    dag.addEdge(i, j);
                }

            }

        }
        
        return dag;
    }

    public static DAG generateBinaryTreeDag(int vertices){
        DAG dag = new DAG(vertices);
        Random r = new Random();
        int level = 0;

        //on each vertex
        for (int i = 1; i < vertices; i++) {
            //for each vertex after it, randomly assign an edge sometimes
            for(int j = i+1;j < vertices;j++){
                if(r.nextBoolean()){
                    dag.addEdge(i, j);
                }

            }

        }
        
        return dag;
    }
}

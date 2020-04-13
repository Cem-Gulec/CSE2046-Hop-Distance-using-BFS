package com.company;

import java.util.ArrayList;
import java.util.List;

public class Graph{

    //number of vertices
    int V;
    //adjacency list representation as a list
    List<List<Integer>> adj_list;

    public Graph(int V){
        this.V = V;

        adj_list = new ArrayList<>();

        for(int i = 0; i < V; i++)
            adj_list.add(new ArrayList<>());
    }

    //u: source  v:destination
    public void add_edge(int u, int v){
        adj_list.get(u).add(v);
        adj_list.get(v).add(u);
    }

    public void printAdjacencyList() {
        for (int i = 0; i < V; i++) {
            System.out.printf("Adjacency list of vertex %d is %s %s", i,
                    adj_list.get(i), System.lineSeparator());
        }
    }

}

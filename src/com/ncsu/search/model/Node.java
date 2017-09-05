package com.ncsu.search.model;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private String name;
    private boolean visited;
    private List<Edge> edges;

    public Node(String name) {
        this.name = name;
        this.visited = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getEdges() {
        if (this.edges == null) {
            this.edges = new LinkedList<Edge>();
        }
        return this.edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public String toString() {
        String stringToPrint = this.getName() + " : " + this.isVisited() + "\n-----------------\n";
        for (Edge edge : this.edges) {
            stringToPrint += edge.toString();
        }
        return stringToPrint + "\n";
    }
}

package com.ncsu.search.model;

import java.util.LinkedList;
import java.util.List;

public class NodeList {
    private List<Node> nodes;

    public List<Node> getNodes() {
        if (this.nodes == null) {
            this.nodes = new LinkedList<Node>();
        }
        return this.nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public Node getNode(String nodeName) {
        if (this.nodes != null) {
            for (Node node : this.nodes) {
                if (node.getName().trim().equalsIgnoreCase(nodeName.trim())) {
                    return node;
                }
            }
        }
        return null;
    }

    public String toString() {
        String stringToPrint = "";
        for (Node node : this.nodes) {
            stringToPrint += node.toString();
        }
        return stringToPrint;
    }
}

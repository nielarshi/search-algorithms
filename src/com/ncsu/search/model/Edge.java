package com.ncsu.search.model;

import java.util.LinkedList;
import java.util.List;

public class Edge {
    private String leftNode;
    private String rightNode;
    private int length;

    public Edge(String leftNode, String rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public String getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(String leftNode) {
        this.leftNode = leftNode;
    }

    public String getRightNode() {
        return rightNode;
    }

    public void setRightNode(String rightNode) {
        this.rightNode = rightNode;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        String stringToPrint = "";
        stringToPrint += this.rightNode + "->" + this.length;
        return stringToPrint + "\n";
    }
}

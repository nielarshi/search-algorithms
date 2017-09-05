package com.ncsu.search.handler;

import com.ncsu.search.model.Edge;
import com.ncsu.search.model.Graph;
import com.ncsu.search.model.Node;

import java.util.LinkedList;

public class BFSHandler implements SearchHandler {

    public LinkedList<String> bfsGraphQueue;
    public int count = -1;

    @Override
    public void search(String srcNodeName, String destNodeName) {
        System.out.println("BFS\n-----------------------\n");
        this.bfsGraphQueue = new LinkedList<>();
        this.bfsGraphQueue.add(srcNodeName);

        String nextNode = "";
        while (!this.bfsGraphQueue.isEmpty()) {
            nextNode = this.bfsGraphQueue.getFirst();
            if (nextNode.equalsIgnoreCase(destNodeName)) {
                System.out.println(++this.count + " : " + destNodeName);
                break;
            } else {
                visitNode(nextNode);
            }
        }

    }

    public void visitNode(String nodeName) {
        //get node
        Node nodeVisiting = Graph.getNodeList().getNode(nodeName);

        if (!nodeVisiting.isVisited()) {
            this.count++;
            System.out.println(this.count + " : " + nodeName);
            for (Edge edge : nodeVisiting.getEdges()) {
                this.bfsGraphQueue.add(edge.getRightNode());
            }
        }

        nodeVisiting.setVisited(true);
        this.bfsGraphQueue.removeFirst();
    }
}

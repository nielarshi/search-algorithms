package com.ncsu.search.handler;

import com.ncsu.search.model.Edge;
import com.ncsu.search.model.Graph;
import com.ncsu.search.model.Node;

import java.util.Stack;

public class DFSHandler implements SearchHandler {

    public Stack<String> dfsGraphStack;
    public int count = 0;

    @Override
    public void search(String srcNodeName, String destNodeName) {
        System.out.println("DFS\n-----------------------\n");

        this.dfsGraphStack = new Stack<String>();
        this.dfsGraphStack.push(srcNodeName);

        String nextNode = "";
        while (!this.dfsGraphStack.isEmpty()) {
            nextNode = this.dfsGraphStack.peek();
            if (nextNode.equalsIgnoreCase(destNodeName)) {
                System.out.println(++this.count + " : " + destNodeName);
                break;
            } else {
                visitNode(nextNode);
            }
        }


    }

    public void visitNode(String nodeName) {
        this.dfsGraphStack.pop();
        //get node
        Node nodeVisiting = Graph.getNodeList().getNode(nodeName);

        if (!nodeVisiting.isVisited()) {
            System.out.println(this.count + " : " + nodeName);
            for (Edge edge : nodeVisiting.getEdges()) {
                this.dfsGraphStack.push(edge.getRightNode());
            }
            this.count++;
        }

        nodeVisiting.setVisited(true);
    }

}

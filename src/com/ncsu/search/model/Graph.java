package com.ncsu.search.model;

import com.ncsu.search.model.Edge;
import com.ncsu.search.model.Node;
import com.ncsu.search.model.NodeList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Graph {

    private static NodeList nodeList = new NodeList();

    public static void initialize() {
        try {
            Scanner input = new Scanner(new FileReader("path.txt"));
            String path = "";
            String[] pathParts = null;
            String srcCityName,
                    destCityName = "";
            int length = 0;
            while(input.hasNext()) {
                path = input.next();
                pathParts = path.split(",");
                srcCityName = pathParts[0];
                destCityName = pathParts[1];
                length = Integer.valueOf(pathParts[2]);

                //System.out.println(srcCityName + " -> " + destCityName);
                //create edge
                Edge edge = null;

                //create both nodes
                //node for srcCity
                Node srcNode = nodeList.getNode(srcCityName);
                if (srcNode == null) {
                    //create new node
                    srcNode = new Node(srcCityName);
                    nodeList.getNodes().add(srcNode);
                }
                edge = new Edge(srcCityName, destCityName);
                edge.setLength(length);
                srcNode.getEdges().add(edge);
                //node for destCity
                Node destNode = nodeList.getNode(destCityName);
                if (destNode == null) {
                    //create new node
                    destNode = new Node(destCityName);
                    nodeList.getNodes().add(destNode);
                }
                edge = new Edge(destCityName, srcCityName);
                edge.setLength(length);
                destNode.getEdges().add(edge);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(nodeList.toString());
    }

    public static NodeList getNodeList() {
        return nodeList;
    }
}

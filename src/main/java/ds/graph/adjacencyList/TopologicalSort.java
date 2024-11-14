package ds.graph.adjacencyList;

import java.util.ArrayList;
import java.util.List;

public class TopologicalSort {
    public static void main(String[] args) {
        List<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));
        nodeList.add(new GraphNode("H", 7));

        Graph graph = new Graph(nodeList);
        graph.addDirectedEdge(0,2);
        graph.addDirectedEdge(2,4);
        graph.addDirectedEdge(4,7);
        graph.addDirectedEdge(4, 5);
        graph.addDirectedEdge(5,6);
        graph.addDirectedEdge(1,2);
        graph.addDirectedEdge(1,3);
        graph.addDirectedEdge(3,5);
        System.out.println(graph);
        graph.topologicalSort();

    }
}

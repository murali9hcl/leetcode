package ds.graph.adjacencyMatrix;

import java.util.ArrayList;
import java.util.List;

public class SSSPP {
    public static void main(String[] args) {
        List<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));

        Graph graph = new Graph(nodeList);
        graph.addUndirectedEdge(0,1);
        graph.addUndirectedEdge(0,2);
        graph.addUndirectedEdge(1,3);
        graph.addUndirectedEdge(1, 6);
        graph.addUndirectedEdge(2,3);
        graph.addUndirectedEdge(2,4);
        graph.addUndirectedEdge(3,5);
        graph.addUndirectedEdge(4,5);
        graph.addUndirectedEdge(5,6);
        graph.BFSForSSSPP(nodeList.get(0));

    }
}

package ds.graph.adjacencyMatrix;

public class GraphNode {
     String name;
     int index;
    public boolean isVisited = false;
    public GraphNode parent;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
package ds.graph;

public class Graph {
    int[][] matrix;

    public Graph(int size) {
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
    }

    public void addEdge(int left, int right) {
        matrix[left][right] = 1;
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}

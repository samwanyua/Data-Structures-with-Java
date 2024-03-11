import java.util.ArrayList;

public class DFS {
    /*
     * Depth first search
     * Is a data structure for traversing a tree or graph data structure
     * Steps:
     * 1. Pick a route
     * 2. Keep going until you reach a dead end or a previously visited node
     * 3. Backtrack to last node that has unvisited neighbors
     * 
     * Ex. Find a path game where you draw a path 
     */
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        // System.out.println(graph.checkEdge(0, 1));
        graph.depthFirstSearch(1);
    }

    static class Node {
        char data;
        // boolean visited;

        Node(char data) {
            this.data = data;
        }

        public char getData() {
            return data;
        }
    }

    static class Graph {
        int[][] matrix;
        ArrayList<Node> nodes;

        Graph(int size) {
            nodes = new ArrayList<>();
            matrix = new int[size][size];
        }

        public void addNode(Node node) {
            nodes.add(node);
        }

        public void addEdge(int src, int dst) {
            matrix[src][dst] = 1;
        }

        public boolean checkEdge(int src, int dst) {
            return matrix[src][dst] == 1;
        }

        public void print() {
            System.out.print("  ");

            for (Node node : nodes) {
                System.out.print(node.getData() + " ");
            }
            System.out.println();

            for (int i = 0; i < matrix.length; i++) {
                System.out.print(nodes.get(i).getData() + " ");
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        public void depthFirstSearch(int src) {
            boolean[] visited = new boolean[matrix.length];
            dfsHlp(src, visited);
        }
        private void dfsHlp(int src, boolean[] visited) {
            if(visited[src]){
                return;
            }
            else{
                visited[src] = true;
                System.out.println(nodes.get(src).data + " : we visited this node");

                for(int i = 0; i < matrix[src].length; i++){
                    if(matrix[src][i] == 1){
                        dfsHlp(i, visited);
                    }
                }
                return;
            }
        }
    }
}

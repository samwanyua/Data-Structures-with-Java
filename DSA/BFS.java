import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    /*
     * Breadth First Search Is a searching algorithm for traversing a tree or
     * group of data structures. This is done one "Level" at a time rather than
     * one "Branch at a time"
     * 
     * Diff between BFS & DFS
     * BFS:
     *      - Transverse the graph level by level
     *      - Utilizes a queue
     *      - Better if destination is on average close to start
     *      - Siblings are visited before children
     * DFS:
     *      - Transverse a graph branch by branch
     *      - Utilizes a stack
     *      - Better if destination is on average far from the start
     *      - Children are visited before siblings
     *      - More popular for games and puzzles
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
        graph.breadthFirstSearch(2);
    }
}

class Node {
    char data;

    Node(char data) {
        this.data = data;
    }

    public char getData() {
        return data;
    }
}

class Graph {
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

    public void breadthFirstSearch(int src) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0){
            src = queue.poll();
            System.out.println(nodes.get(src).data + " : visited");

            for(int i = 0; i < matrix[src].length; i++){
                if(matrix[src][i] == 1 && !visited[i] ){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }

    }
}

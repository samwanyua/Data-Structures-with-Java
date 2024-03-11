public class Adjacency_matrix {
    /*
     * Adjacency matrix - an array to store 1's and 0's to represent edges
     *                  # of rows = #(no.) of unique nodes
     *                  # of columns = # of unique nodes
     * 
     * Runtime complexity to check an edge: O(1)
     * Space complexity: O(V^2)
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
    }
}
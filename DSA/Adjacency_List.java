// public class Adjacency_List {
//     /*
//      * Adjacency list = array/arraylist of linked lists
//      * Each linked list has a unique node at the head
//      * All adjacent neighbors to that node are added to that node's linkedlist
//      * 
//      * Runtime complexity to check an edge is O(v)
//      * 
//      * Space complexity O(V + e)
//      */
//     public static void main(String[] args) {
//         Graph graph = new Graph();

//         graph.addNode(new Node('A'));
//         graph.addNode(new Node('B'));
//         graph.addNode(new Node('C'));
//         graph.addNode(new Node('D'));
//         graph.addNode(new Node('E'));

//         graph.addEdge(0,1);
//         graph.addEdge(1,2);
//         graph.addEdge(1,4);
//         graph.addEdge(2,3);
//         graph.addEdge(2,4);
//         graph.addEdge(4,0);
//         graph.addEdge(4,2);

//         graph.print();
//     }
// }

import java.util.ArrayList;
import java.util.LinkedList;

public class Adjacency_List {
    public static void main(String[] args) {
        Graph_list graph = new Graph_list();

        graph.addNode(new Node_list('A'));
        graph.addNode(new Node_list('B'));
        graph.addNode(new Node_list('C'));
        graph.addNode(new Node_list('D'));
        graph.addNode(new Node_list('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }
}

class Graph_list {
    ArrayList<LinkedList<Node_list>> alist;

    Graph_list() {
        alist = new ArrayList<>();
    }

    public void addNode(Node_list node) {
        LinkedList<Node_list> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node_list> currentList = alist.get(src);
        Node_list dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node_list> currentList = alist.get(src);
        Node_list dstNode = alist.get(dst).get(0);

        for (Node_list node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node_list> currentList : alist) {
            for (Node_list node : currentList) {
                System.out.print(node.getData() + " -> ");
            }
            System.out.println();
        }
    }
}

class Node_list {
    char data;

    Node_list(char data) {
        this.data = data;
    }

    public char getData() {
        return data;
    }
}

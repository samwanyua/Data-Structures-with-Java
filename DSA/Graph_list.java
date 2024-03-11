import java.util.ArrayList;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class Graph_list {
    ArrayList<LinkedList<Node>> alist;


    Graph_list(){
        alist  = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node>  currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);

    }

    public void addEdge(int src, int dst) {
        LinkedList<Node>  currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode); //adding it to the tail
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node>  currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for(Node  node: currentList){
            if(node == dstNode){
                return true;
            }
        }
        return false;
    }

    public void print() {
        for(LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.println(node.data + " -> ");
            }
            System.out.println();
        }
    }
}

public class Binary_search_tree {
    /* 
     * Binary Search tree
     * Binary tree - each node has no more than two children
     * Binary search tree - have a specific order
     * BST - the root node is greater than the left child but less than the right child
     * Left-most child is the least value
     * Right - most value is the greatest value
     * Runtime capacity - O(log n)
     * 
     * 
    */
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // inserting nodes
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.remove(9);

        tree.display();
        System.out.println(tree.search(0));

    }
    /**
     * Node
     */
    static class Node {
    
        int data;
        Node left;
        Node right;

        public  Node(int data) {
            this.data = data;
        }
    }

    /**
     * BinarySearchTree
     */
    static class BinarySearchTree {
        Node root;

        public void insert(Node node) {
            root = insertHelper(root, node);
        }

        private Node insertHelper(Node root, Node node) {
            int data = node.data;

            if(root == null){
                root = node;
                return root;
            }
            else if(data < root.data){
                root.left = insertHelper(root.left, node);
            }
            else{
                root.right = insertHelper(root.right, node);
            }
            return root;
        }

        public void display() {
            displayHelper(root);
        }

        private void displayHelper(Node root) {
            if(root != null){
                displayHelper(root.left);
                System.out.println(root.data);
                displayHelper(root.right);

            }
        }

        public boolean search(int data) {
            return searchHelper(root, data);
        }

        private boolean searchHelper(Node root, int data) {
            if(root == null){
                return false;
            }
            else if( root.data == data){
                return true;
            }
            else if(root.data > data){
                return searchHelper(root.left, data);
            }
            else{
                return searchHelper(root.right, data);
            }
        }

        public void remove(int data) {
            if(search(data)){
                removeHelper(root, data);
            }
            else{
                System.out.println(data + " could not be found!");
            }
        }

        private Node removeHelper(Node root, int data) {
            if(root == null ){
                return root;
            }
            else if(data < root.data){
                root.left = removeHelper(root.left, data);
            }
            else if(data > root.data){
                root.right = removeHelper(root.right, data);
            }
            else{
                //node found
                if(root.left == null && root.right == null){
                    root = null;
                }
                else if(root.right != null){
                    //find a successor to replace this node
                    root.data = succesor(root);
                    root.right = removeHelper(root.right, root.data);
                }
                else{ //find a predecessor to replace this node
                    root.data = predecessor(root);
                    root.left = removeHelper(root.left, root.data);

                }
            }
            return root;
        }
        
        private int succesor(Node root) {
            // find the least value below the right child of this root node
            root = root.right;
            while(root.left != null){
                root = root.left;
            }
            return root.data;
        }

        private int predecessor(Node root) {
            // find the greatest value below the left child of this root node
            root = root.left;
            while(root.right != null){
                root = root.right;
            }
            return root.data;
        }

    }
}

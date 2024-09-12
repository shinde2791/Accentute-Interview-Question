class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class Binarytreeornot {
    Node root;

    // Helper function to check the validity of the BST
    boolean isBST(Node node, Integer min, Integer max) {
        // Base case: if the node is null, it's a valid BST
        if (node == null) {
            return true;
        }

        // If this node violates the min/max constraint, return false
        if ((min != null && node.data <= min) || (max != null && node.data >= max)) {
            return false;
        }

        // Recursively check the left and right subtree
        return isBST(node.left, min, node.data) && isBST(node.right, node.data, max);
    }

    // Function to initiate the check
    boolean isBST() {
        return isBST(root, null, null);
    }

    public static void main(String[] args) {
        Binarytreeornot tree = new Binarytreeornot();
        
        // Creating a simple binary tree
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if (tree.isBST()) {
            System.out.println("This is a Binary Search Tree.");
        } else {
            System.out.println("This is NOT a Binary Search Tree.");
        }
    }
    
}

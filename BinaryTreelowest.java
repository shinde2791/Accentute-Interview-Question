import java.util.*;

class TreeNode{
    int value;
    TreeNode left,right;

 TreeNode(int value) {
    this.value=value;

    }
}
public class BinaryTreelowest {

    public TreeNode findlca(TreeNode root,TreeNode p,TreeNode q){
        if(root == null || root == p || root == q) return  root;
        
        TreeNode left=findlca(root.left, p, q);
        TreeNode right=findlca(root.left, p, q);

        return (left !=null && right !=null ) ? root : (left !=null ? left:right);
    }
    public static void main(String[] args) {
        BinaryTreelowest Tree = new BinaryTreelowest();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        TreeNode lca = Tree.findlca(root, root.left.left, root.left.right); // LCA of nodes 4 and 5
        System.out.println("Lowest Common Ancestor: " + lca.value);
    }
    }
    


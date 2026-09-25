package Practice_problem_07;

public class Mirror_of_binary_tree_02 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static void preOrder(Node root){
        if(root == null){
            System.out.print("N ");
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static Node mirrorBinaryTree(Node root){
        if(root == null){
            return null;
        }

        
        Node leftSubTree = mirrorBinaryTree(root.left);
        Node rightSubTree = mirrorBinaryTree(root.right);
        Node newRoot = new Node(root.data);
        newRoot.right = leftSubTree;
        newRoot.left = rightSubTree;
        return newRoot;
    }

    public static void mirrorInPlace(Node root){
        if(root == null){
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorInPlace(root.left);
        mirrorInPlace(root.right);
    }
    public static void main(String arg[]){
        /*                    
                              1
                            /   \
                           2     3
                          / \   / \
                         4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preOrder(root);
        System.out.println();
        Node newRoot = mirrorBinaryTree(root);
        preOrder(newRoot);
        System.out.println();
        mirrorInPlace(root);
        preOrder(root);
    }
        
}

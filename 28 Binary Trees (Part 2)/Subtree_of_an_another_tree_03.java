public class Subtree_of_an_another_tree_03 {
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

    public static boolean isIdentical(Node root , Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        else if(root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }

        return isIdentical(root.left,subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    public static boolean subtreeInTree(Node root , Node subRoot){ // in worst case O(N^2) if many nodes data in main tree is equal to subtree root data
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data ){
            if (isIdentical(root,subRoot)){
                return true;
            };
        }

        return subtreeInTree(root.left, subRoot) || subtreeInTree(root.right, subRoot);
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

        /*
                           2
                          / \
                         4   5
        */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println("is subtree in binary tree (true or false) : "+subtreeInTree(root, subRoot));
    }
}

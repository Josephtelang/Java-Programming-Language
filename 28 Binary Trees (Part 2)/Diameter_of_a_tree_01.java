

public class Diameter_of_a_tree_01 {
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

    public static int height(Node root){ // TC = O(N) , SC = O(H)
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }

    public static int diameterOfATree(Node root){ // O(N^2)
        if(root == null){
            return 0;
        }

        int leftDiam = diameterOfATree(root.left);
        int leftHit = height(root.left);
        int rightDiam = diameterOfATree(root.right);
        int rightHit = height(root.right);

        int selfDiam = leftHit + rightHit + 1;

        return Math.max(selfDiam , Math.max(leftDiam,rightDiam));
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

        System.out.println("Diameter of a binary tree : "+diameterOfATree(root));
    }
    
}

    


package Practice_problem_07;

public class Delete_leaf_nodes_with_value_of_x_03 {
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
    
    public static Node deleteLeafWithX(Node root, int target){
        if(root == null){
            return null;
        }

        Node leftNode = deleteLeafWithX(root.left,target);
        Node rightNode = deleteLeafWithX(root.right,target);
        root.left = leftNode;
        root.right = rightNode;
        
        
        if(leftNode == null && rightNode == null && root.data == target){
            return null;
            
        }

        return root;


    }

    public static void main(String arg[]){
        /*                    
                              1
                            /   \
                           3     3
                          / \   
                         3   2 
        */

        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right = new Node(3);
        
        preOrder(root);
        Node newRoot = deleteLeafWithX(root, 3);
        System.out.println();
        preOrder(newRoot);
    }
      
    
}

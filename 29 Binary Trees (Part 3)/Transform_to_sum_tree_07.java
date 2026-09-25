public class Transform_to_sum_tree_07 {
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

    public static int sumTree(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);
        int currData = root.data;

        root.data = leftSum + rightSum;


        return currData + root.data;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
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

        System.out.println("sumTree root node data : "+sumTree(root));
        preorder(root);
    } 
}

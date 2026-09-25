public class Count_nodes_of_a_tree_07 {
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

    public static int countNodes(Node root){ // TC = O(n)
        if(root == null){
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount+rightCount+1;
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

        System.out.println("number of nodes in tree are : "+countNodes(root));
    }
    
    
}

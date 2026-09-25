public class Diameter_of_a_tree_Optimized_02 {
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

    static class Info{
        int diam;
        int hit;

        Info(int diam, int hit){
            this.diam = diam;
            this.hit = hit;
        }
    }

    public static Info diameterOfATreeOptimized(Node root){
        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo = diameterOfATreeOptimized(root.left);
        Info rightInfo = diameterOfATreeOptimized(root.right);

        int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam) , leftInfo.hit + rightInfo.hit + 1);
        int hit = Math.max(leftInfo.hit , rightInfo.hit) + 1;

        return new Info(diam,hit);
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

        System.out.println("Diameter of the binary tree : "+diameterOfATreeOptimized(root).diam);
    }
    
}

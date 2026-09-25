import java.util.Scanner;

public class Mini_distance_betn_two_nodes_05 {
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

    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = lca2(root.left, n1, n2);
        Node rightLCA = lca2(root.right, n1, n2);
        

        // if left subtee does not have n1 or n2 
        if(leftLCA == null){
            return rightLCA;
        }
        
        // if right subtree does not have n1 or n2
        if(rightLCA == null){
            return leftLCA;
        }
        
        // if both right and left subtree have n1 or n2
        return root;
    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left,n);
        int rightDist = lcaDist(root.right,n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        else if(leftDist == -1){
            return rightDist + 1;
        }
        else{
            return leftDist + 1;
        }
    }

    public static int miniDist(Node root , int n1 , int n2){
        Node lca = lca2(root, n1 , n2);
        int lcaDisFromn1 = lcaDist(lca,n1);
        int lcaDistFromn2 = lcaDist(lca,n2);

        if(lcaDisFromn1 == -1 || lcaDistFromn2 == -1){
            System.out.println("invalid Input");
            return -1;
        }

        return lcaDisFromn1 + lcaDistFromn2;
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
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n1(node 1) and n1(node 2) for there lowest common ancestor : ");
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();

        System.out.println("Minimum distance between n1 and n2 : "+miniDist(root,n1,n2));

        

    }    
}

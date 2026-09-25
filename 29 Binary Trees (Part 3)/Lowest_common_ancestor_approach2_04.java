import java.util.ArrayList;
import java.util.Scanner;

public class Lowest_common_ancestor_approach2_04 {
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
        System.out.println("Enter the n1(node 1) and n1(node 2) for there lowest common encestor : ");
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();

        Node lca2 = lca2(root,n1,n2);
        System.out.println("The lowest common encestor is : "+ (lca2 == null ? "n1 and n2 not found" : lca2.data));

    }
    
}

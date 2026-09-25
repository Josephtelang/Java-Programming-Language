import java.util.*;

public class Kth_ancestor_of_node_06 {
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

    public static int kthAncestor(Node root, int n, int k ){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = kthAncestor(root.left,n,k);
        // Kth ancestor already found 
        if(leftDist == -2){
            return -2;
        }
        int rightDist = kthAncestor(root.right,n,k);
        // Kth ancestor already found
        if(rightDist == -2){
            return -2;
        }

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist,rightDist);
        if(max+1 == k){
            System.out.println("Kth Ancestor of Node "+n+" : "+root.data);
            return -2;
        }

        return max+1;
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
        System.out.print("Enter then Node data : ");
        int n = sc.nextInt();
        System.out.print("Enter the Kth position : ");
        int k = sc.nextInt();
        int result = kthAncestor(root,n,k);
        if(result != -2){
            if(result == -1){
                System.out.println("Node does not exist");
            }
            else if(result < k){
                System.out.println("Kth ancestor does not exist");
            }
        }
        
    }
    
}

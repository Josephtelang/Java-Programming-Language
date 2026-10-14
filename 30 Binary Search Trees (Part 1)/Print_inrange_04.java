import java.util.Scanner;

public class Print_inrange_04{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }

    }

    static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val < root.data){
            // left subtree
            root.left = insert(root.left,val);
        }
        else if(val > root.data){
            // right subtree
            root.right = insert(root.right,val);
        }

        return root;

    }

    static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(k1 <= root.data && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data > k2){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    
    public static void main(String arg[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){  
            root = insert(root,values[i]); 
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of starting range of k1 : ");
        int k1 = sc.nextInt();
        System.out.println("Enter the value of ending of range k2 : ");
        int k2 = sc.nextInt();
        inOrder(root);
        System.out.println();
        printInRange(root, k1, k2);

    } 
}
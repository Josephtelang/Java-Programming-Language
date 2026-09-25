import java.util.*;
public class Kth_Level_using_PreOrder_lecture_01 {
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

    public static void kthLevelUsingPreOrder(Node root, int level , int k){
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data+" ");
            return;
        }

        kthLevelUsingPreOrder(root.left, level+1 , k);
        kthLevelUsingPreOrder(root.right, level+1, k);
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
        System.out.println("Enter the Kth level you want to print : ");
        int k = sc.nextInt();
        kthLevelUsingPreOrder(root,1,k);


    }  
}

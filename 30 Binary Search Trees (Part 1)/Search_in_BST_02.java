import java.util.*;

public class Search_in_BST_02 {
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

    static boolean searchInBST(Node root, int key){ // TC = O(H)
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return searchInBST(root.left,key);
        }
        else{
            return searchInBST(root.right,key);
        }
    }
    public static void main(String arg[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){  
            root = insert(root,values[i]);
        }

        inOrder(root);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key you want to find : ");
        int key = sc.nextInt();

        if(searchInBST(root, key)){
            System.out.println("key found");
        }
        else{
            System.out.println("key not found");
        }
    } 
}

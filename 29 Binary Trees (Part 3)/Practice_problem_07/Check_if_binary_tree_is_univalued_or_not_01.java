package Practice_problem_07;
import java.util.*;
public class Check_if_binary_tree_is_univalued_or_not_01 {
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

    
    public static boolean checkIfUnivaluedOrNot(Node root ){
        if(root == null){
            return true;
        }

        if(root.left != null){
            if(root.left.data != root.data){
                return false;
            }
        }
        
        if(root.right != null){
            if(root.right.data != root.data){
                return false;
            }
        }
        

        boolean leftCheck = checkIfUnivaluedOrNot(root.left);
        boolean rightCheck = checkIfUnivaluedOrNot(root.right);

        return leftCheck && rightCheck;
    }
    public static void main(String arg[]){

        Node  newroot = new  Node(2);
        newroot.left = new  Node(2);
        newroot.right  = new Node (2);
        newroot.left.left = new Node(5);
        newroot.left.right = new  Node(2);

        if(checkIfUnivaluedOrNot(newroot)){
            System.out.println("Binary tree is univalued ");
        }
        else{
            System.out.println("Binary tree is not univalued ");
        }
        
    }
    
    
}

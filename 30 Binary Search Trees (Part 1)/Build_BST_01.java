
public class Build_BST_01 {
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
    public static void main(String arg[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){  // TC = O(n^2)
            root = insert(root,values[i]);
            // Object's fields can be changed through a reference,
            // but if the reference itself needs to point to a new object, you need to return/reassign it.  
        }

        inOrder(root);
    }
    
}

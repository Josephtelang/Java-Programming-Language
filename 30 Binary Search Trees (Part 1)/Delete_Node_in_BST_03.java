import java.util.Scanner;

public class Delete_Node_in_BST_03 {
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

    static Node deleteNode(Node root , int target){
        if(root == null){
            return null;
        }
        if(root.data > target){
            root.left =  deleteNode(root.left,target);
        }
        else if(root.data < target){
            root.right =  deleteNode(root.right,target);
        }
        else{
            // case - 1 : both child are null
            if(root.left == null && root.right == null){
                return null;
            }

            // case - 2 : any one child is null
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case - 3 : both childs are not null
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }

        return root;
    }

    static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String arg[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){  
            root = insert(root,values[i]); 
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the node data you want to delete : ");
        int target = sc.nextInt();
        root = deleteNode(root, target);
        inOrder(root);

    } 
}

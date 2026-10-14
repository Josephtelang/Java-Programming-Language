import java.util.ArrayList;

public class Root_to_leaf_path_05 {
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

    public static void printPath(ArrayList<Integer> path){
        for(int i=0 ; i<path.size() ; i++){
            System.out.print("->"+path.get(i)+" ");
        }

        System.out.println("null");
    }

    public static void printPathToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        }

        printPathToLeaf(root.left, path);
        printPathToLeaf(root.right, path);

        path.remove(path.size()-1);
    }


    
    public static void main(String arg[]){
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){  
            root = insert(root,values[i]); 
        }

        printPathToLeaf(root, new ArrayList<>());

   
        
        

    }    
}

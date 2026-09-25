import java.util.*;

public class Lowest_common_ancestor_approach1_03 {
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

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }

        path.add(root);
        if(root.data == n){
            return true;
        }
        
        boolean leftFound = getPath(root.left,n,path);
        boolean rightFound = getPath(root.right,n,path);

        if(leftFound || rightFound){
            return true;
        }

        path.remove(path.size()-1);
        return false;

    }

    public static Node lca(Node root , int n1 , int n2){  // TC = N + N + N SC = N + N = N
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        boolean n1Found = getPath(root,n1,path1);
        boolean n2Found = getPath(root,n2,path2);

        if(!n1Found || !n2Found){
            return null;
        }

        // lowest common ancestor
        int i = 0;
        for( ; i<path1.size()&&i<path2.size() ; i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        // lca index -> i-1
        return path1.get(i-1);

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

        Node lca = lca(root,n1,n2);
        System.out.println("The lowest common encestor is : "+ (lca == null ? "n1 and n2 not found" : lca.data));

    }
    
    
}

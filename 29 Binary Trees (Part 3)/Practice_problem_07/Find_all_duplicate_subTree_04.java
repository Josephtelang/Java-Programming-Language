package Practice_problem_07;
import java.util.*;

public class Find_all_duplicate_subTree_04 {
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

    public static void preOrder(Node root){
        if(root == null){
            System.out.print("N ");
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static String findDuplicates(Node root, ArrayList<Node> result, HashMap<String,Integer> map){
        if(root == null){
            return  "#";
        }

        String leftString = findDuplicates(root.left, result,map);
        String rightString = findDuplicates(root.right, result,map);
        
        
        String newStr = root.data+','+leftString+','+rightString;

        int count = map.getOrDefault(newStr,0);
        if(count == 1){
            result.add(root);
        }
        count++;
        map.put(newStr,count);
        return newStr;
    }
    public static void main(String arg[]){
        /*                    
                              1
                            /   \
                           3     3
                          / \   / \
                         6   7 6   7
        */

        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        ArrayList<Node> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        findDuplicates(root, result, map);
        if(result.isEmpty()){
            System.out.println("There is not any duplicate string in this binary tree");
        }
        else{
            for(int i = 0 ; i < result.size(); i++){
                preOrder(result.get(i));
            }
        }
        
    }
      
}

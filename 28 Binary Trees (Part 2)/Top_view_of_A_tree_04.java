import java.util.*;

public class Top_view_of_A_tree_04 {
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

    static class Info{
        Node node;
        int hd;
        
        Info( Node node ,int hd ){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topViewOfTree(Node root){
        if(root == null){
            return;
        }
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        q.add(new Info(root,0));
        q.add(null);

        int max = 0 , min = 0;

        while(!q.isEmpty()){
            Info currInfo = q.remove();
            if(currInfo == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(currInfo.hd)){// contain then ture if not then false
                    map.put(currInfo.hd,currInfo.node);
                } 

                if(currInfo.node.left != null){
                    q.add(new Info(currInfo.node.left,currInfo.hd-1));
                    min = Math.min(min,currInfo.hd-1);
                }

                if(currInfo.node.right != null){
                    q.add(new Info(currInfo.node.right,currInfo.hd+1));
                    max = Math.max(max,currInfo.hd+1);
                }
            }
        }

        for(int i = min ; i<= max ; i++){
            System.out.print(map.get(i).data+" ");
        }
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

        topViewOfTree(root);

    }
}

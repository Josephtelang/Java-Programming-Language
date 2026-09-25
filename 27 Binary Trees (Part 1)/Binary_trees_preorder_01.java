
public class Binary_trees_preorder_01 {
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

    static class BinaryTree{
        int idx = -1;
        public Node buildTree(int nodes[]){ // TC = O(n)
            idx++;

            if(idx >= nodes.length || nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void main(String arg[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        if(root != null){
            System.out.println(root.data);
        }

    }
    
}

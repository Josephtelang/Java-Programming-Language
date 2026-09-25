package Practice_problem_07;

public class Maximum_path_node_sum_05 {
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
        int maxSumOfSubTree;
        int maxSum;

        Info(int maxSumOfSubTree, int maxSum){
            this.maxSumOfSubTree = maxSumOfSubTree;
            this.maxSum = maxSum;
        }
    }

   public static Info maxPathNodeSum(Node root){
        if(root==null){
            return new Info(0,Integer.MIN_VALUE);
        }

        Info leftInfo = maxPathNodeSum(root.left);
        Info rightInfo = maxPathNodeSum(root.right);
        int rootData = root.data;
        int leftContribution = Math.max(leftInfo.maxSumOfSubTree,0);
        int rightContribution = Math.max(rightInfo.maxSumOfSubTree,0);
        int maxSum = Math.max(Math.max(leftInfo.maxSum,rightInfo.maxSum),leftContribution + rightContribution + rootData);
        return new Info(Math.max(leftContribution,rightContribution) + rootData ,maxSum);
        
   }
    public static void main(String arg[]){
        /*                    
                              1
                            /   \
                           2     3
                          / \   / \
                         4   5 12   12
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(12);
        root.right.right = new Node(12);
        
        System.out.println("maximum node sum path : "+maxPathNodeSum(root).maxSum);
    }    
}

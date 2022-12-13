package BinaryTree;

public class HeightOfTree {
    
    static class Node{

        int data;
        Node left=null;
        Node right= null;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right = null;

        }
    }

    public static int height(Node root){

        if(root == null){
             return 0;
        }

        int lh = height(root.left);
        int rh= height(root.right);

        return Math.max(lh, rh)+1;
    }

    public static int countNode(Node root){

        if(root == null){
            return 0;
        }

        int cleft = countNode(root.left);
        int rleft = countNode(root.right);

        return cleft + rleft +1;
    }

    public static int SumNode(Node root){

        if(root == null)
        {
            return 0;

        }

        int lSum= SumNode(root.left);
        int Rsum = SumNode(root.right);
        int sum = lSum + Rsum + root.data;
        return sum;
    }

    //Approach 1
    public static int diameter(Node root){  // O(N^2)

        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = rightDiam + rightHt +1;

        return Math.max(selfDiam, Math.max(rightDiam, selfDiam));
        
    }

    // Approach 2

    static class Info{

        
    }
    public static void main(String[] args) {

        /*          1
         *         / \
         *        2   3
         *      / \   / \
         *     4   5  6  7
         * 
         */

         Node  root= new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right= new Node(7);
        
       // System.out.println( height(root));
       // System.out.println(countNode(root));
       System.out.println(SumNode(root));
       System.out.println(diameter(root));
    }
}

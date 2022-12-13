package BinaryTree;

public class CountNode {

    static class Node{

        int data ;
        Node left, right;

        public Node(int data){

            this.data=data;
            this.left=null;
            this.right= null;

        }

    }

    static class CN{

    public static int countn(Node root){

        if(root == null){

            return 0;
        }
        int leftCount = countn(root.left);
        int rightCount = countn(root.right);

        return leftCount + rightCount + 1;

    }

    
}

    public static void main(String[] args) {
        
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        CN count= new CN();
        // Node root = count.countn(nodes);

        // System.out.println(countn(root));
    }
}

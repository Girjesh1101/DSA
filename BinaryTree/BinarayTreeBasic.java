package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;



public class BinarayTreeBasic {

     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx= -1;      // update  index value while calling recusion
        public static Node buildTree(int nodes[]){
            idx++;  // update 

            if(nodes[idx] == -1){       // if index is null

                return null;
            }

            Node newNode= new Node(nodes[idx]); // creating new Node by calling contructore of Node

            newNode.left = buildTree(nodes);    // creating left side using Recusion
            newNode.right = buildTree(nodes);   // creating right side using Recusion

            return newNode;
        }

        public static void preorder(Node root){     //   O(n)

            if(root == null){
                return;
            }
            
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){

            if(root == null){
               return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){

            if(root== null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        // level order

        public static void levelorder(Node root){

            if(root== null){
                return ;
            }

            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){

                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                    q.add(currNode.right);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println(root.data);

       //tree.preorder(root);

       //tree.inorder(root);
 
       //tree.postorder(root);

       //tree.levelorder(root);
    }
}
package Tree;

import java.util.LinkedList;
import java.util.Queue;

import static Tree.BinaryTrees.BinaryTree.*;

public class BinaryTrees {


    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx = -1;


        // Using preorder to build the tree. For postorder, inorder we change the sequence of calls.
        public static Node buildTree(int[] nodes){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void printInorder(Node root){
            if(root == null){
                return;
            }

            printInorder(root.left);
            System.out.print(root.data +" ");
            printInorder(root.right);
        }

        public static void printPostorder(Node root){
            if(root == null){
                return;
            }

            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.data + " ");

        }

        public static void printPreorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }

        public static void BFS(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr ==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curr.data + " ");
                    if(curr.left !=null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);

        BFS(root);

    }

}

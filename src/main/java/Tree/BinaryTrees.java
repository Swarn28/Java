package Tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

import static Tree.BinaryTrees.BinaryTree.*;


/*
* https://www.youtube.com/watch?v=-DzowlcaUmE&t=2465s
*
* */
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

        public static int countNodes(Node root){
            if(root == null){
                return 0;
            }

            int leftCount=0, rightCount=0;

            leftCount = countNodes(root.left);
            rightCount = countNodes(root.right);

            return leftCount+rightCount+1;

        }

        public static int height(Node root){
            if(root == null){
                return 0;
            }

            int leftHeight =0, rightHeight=0, maxHeight=0;

            leftHeight = height(root.left);
            rightHeight = height(root.right);

            maxHeight = Math.max(leftHeight, rightHeight);

            return maxHeight + 1;

        }

        public static int sum(Node root){
            if(root == null){
                return 0;
            }

            int leftSum = sum(root.left);
            int rightSum = sum(root.right);

            return leftSum + rightSum + root.data;

        }

        public static TreeInfo diameter(Node root){
            TreeInfo leftTreeInfo = new TreeInfo();
            TreeInfo rightTreeInfo = new TreeInfo();

            if(root == null){
                return new TreeInfo(0,0);
            }

            leftTreeInfo = diameter(root.left);
             rightTreeInfo = diameter(root.right);

             int diam1 = leftTreeInfo.getDiam();
             int diam2 = rightTreeInfo.getDiam();
            int diam3 = leftTreeInfo.getHeight() + rightTreeInfo.getHeight() + 1;

            int myDiam = Math.max(Math.max(diam1, diam2) , diam3);
            int myHeight = Math.max(leftTreeInfo.getHeight(), rightTreeInfo.getHeight()) + 1;

            TreeInfo maxTree = new TreeInfo();
            maxTree.setDiam(myDiam);
            maxTree.setHeight(myHeight);

            return maxTree;
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);

        BFS(root);

        System.out.println("Count of nodes is: "+ countNodes(root));

        System.out.println("Height is: " +height(root));

        System.out.println("Sum of tree is: " +sum(root));

        System.out.println("Diameter is :" +diameter(root).getDiam());

    }

}

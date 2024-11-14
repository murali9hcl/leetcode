package ds.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    BinaryNode root;

    public BST(){
        //this.root = null;
    }

    private BinaryNode insert(BinaryNode currentNode, int value) {
        if(currentNode ==null) {
            BinaryNode newNode = new BinaryNode(value);
            //System.out.println("value inserted successfully");
            return newNode;
        } else if(value < currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
       this.root = insert(this.root, value);
    }

    public void preOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        if (this.root == null) {
            return;
        }
        queue.add(this.root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print( presentNode.value + " ");
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode search(BinaryNode node, int value){
        if(node == null) {
            System.out.println("root node is null");
            return null;
        } else if(node.value == value) {
            System.out.println("value found in the BST");
            return node;
        } else if(value < node.value) {
           return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public void deleteBST() {
        this.root = null;
        System.out.println("BST deleted successfully");
    }
}

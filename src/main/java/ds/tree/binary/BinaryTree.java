package ds.tree.binary;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BinaryTree {
    BinaryNode root;

    public BinaryTree(){
        this.root = null;
    }

    public void preOrder(BinaryNode node){
        if(node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node){
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node){
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder() {
        if (this.root == null) {
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
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

    public void search(String item) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (Objects.equals(presentNode.value, item)) {
                System.out.print("search item found in the binary tree");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.print("search item not found in the binary tree");
    }

    public void insert(String item) {
        BinaryNode newNode = new BinaryNode(item);
        if(root == null){
            root = newNode;
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("inserted successfully");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("inserted successfully");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(this.root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.right = null;
            } else if (presentNode.right == null) {
                presentNode.left = null;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;


    }

    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (Objects.equals(presentNode.value, value)) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("deepest node is deleted");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("node doesn't exists in binary tree");
    }

    public void deleteBinaryTree() {
        this.root = null;
        System.out.println("Binary tree is deleted");
    }
}

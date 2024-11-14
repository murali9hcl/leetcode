package ds.tree.solution;

import java.util.Stack;

public class BinaryTree {
    private Node root;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addRecursive(root, value);
        }
    }

    private void addRecursive(Node current, int value) {
        if (value < current.value) {
            if (current.left == null) {
                current.left = new Node(value);
            } else {
                addRecursive(current.left, value);
            }
        } else if (value > current.value) {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                addRecursive(current.right, value);
            }
        }
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }

    private void traverseInOrderRecursive(Node node) {
        if (node != null) {
            traverseInOrderRecursive(node.left);
            System.out.print(node.value + " ");
            traverseInOrderRecursive(node.right);
        }
    }

    public void inOrderTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.value + " ");
            current = current.right;

        }
    }

    public void preOrderTraversal(Node root) {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.value + " ");

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public void postOrderTraversal(Node root) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        if (root != null) {
            stack1.push(root);
        }

        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);

            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }

        while (!stack2.isEmpty()) {
            Node node = stack2.pop();
            System.out.print(node.value + " ");
        }

    }

    public void postOrderTraversalUpdated(Node root) {
        Stack<Node> stack = new Stack<>();
        Node lastVisited = null;
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                Node peekNode = stack.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    System.out.print(peekNode.value + " ");
                    lastVisited = stack.pop();
                }
            }
        }
    }



    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}

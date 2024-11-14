package ds.binary.tree;

public class BinaryTreeTestDrive {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        //bt.traverseInOrderWithoutRecursion();

        //System.out.println(bt.containsNode(10));
        //bt.traverseLevelOrder();
        //bt.traverseInOrder(bt.root);
        bt.traversePreOrder(bt.root);


    }
}

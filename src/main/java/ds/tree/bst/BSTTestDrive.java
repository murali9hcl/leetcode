package ds.tree.bst;

public class BSTTestDrive {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);
        //bst.preOrder(bst.root);
        //bst.inOrder(bst.root);
        //bst.postOrder(bst.root);
        //bst.levelOrder();
        bst.search(bst.root, 51);
        bst.deleteBST();
    }
}

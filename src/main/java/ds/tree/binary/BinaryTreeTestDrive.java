package ds.tree.binary;

public class BinaryTreeTestDrive {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
//        BinaryNode n1 = new BinaryNode("N1");
//        BinaryNode n2 = new BinaryNode("N2");
//        BinaryNode n3 = new BinaryNode("N3");
//        BinaryNode n4 = new BinaryNode("N4");
//        BinaryNode n5 = new BinaryNode("N5");
//        BinaryNode n6 = new BinaryNode("N6");
//        BinaryNode n7 = new BinaryNode("N7");
//        BinaryNode n8 = new BinaryNode("N8");
//        BinaryNode n9 = new BinaryNode("N9");
//        n1.left = n2;
//        n1.right = n3;
//        n2.left = n4;
//        n2.right = n5;
//        n4.left = n8;
//        n4.right = n9;
//
//        n3.left = n6;
//        n3.right = n7;

      //  binaryTree.root = n1;
        //binaryTree.preOrder(binaryTree.root);
        //binaryTree.inOrder(binaryTree.root);
        //binaryTree.postOrder(binaryTree.root);
        //binaryTree.levelOrder();
       // binaryTree.search("N10");

        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");
        System.out.println("data inserted successfully");

        binaryTree.levelOrder();
        binaryTree.deleteNode("N7");
        binaryTree.levelOrder();


        binaryTree.deleteBinaryTree();
        binaryTree.levelOrder();
    }




}

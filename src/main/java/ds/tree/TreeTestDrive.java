package ds.tree;

public class TreeTestDrive {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");

        TreeNode cold = new TreeNode("Cold");
        TreeNode  beer = new TreeNode("Beer");
        TreeNode  wine = new TreeNode("Wine");

        cold.addChild(beer);
        cold.addChild(wine);

        hot.addChild(tea);
        hot.addChild(coffee);

        drinks.addChild(hot);
        drinks.addChild(cold);

        System.out.println(drinks.print(1));
    }
}

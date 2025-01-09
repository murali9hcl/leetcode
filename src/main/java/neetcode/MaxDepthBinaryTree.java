package neetcode;

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        if(root == null) {
            return maxDepth;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

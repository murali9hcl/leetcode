package ds.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private String data;
    private List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        children = new ArrayList<>();
    }

    public void addChild(TreeNode node){
        this.children.add(node);
    }

    public String print(int level) {
        String ret;
        ret = " ".repeat(level)+data+"\n";
        for (TreeNode node: this.children) {
            ret +=node.print(level+1);
        }
        return ret;
    }

}

package leetcode._0226_Invert_Binary_Tree;

public class Solution {
    public TreeNode invertTree(TreeNode node) {
        if (node == null) {
            return node;
        }

        TreeNode left = invertTree(node.left);
        TreeNode right = invertTree(node.right);

        node.left = right;
        node.right = left;

        return node;
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
package leetcode._938_Range_Sum_of_BST;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;

        if(root.val <= high && root.val >= low) {
            result += root.val;
        }

        if (root.left != null) result += rangeSumBST(root.left, low, high);
        if (root.right != null) result += rangeSumBST(root.right, low, high);

        return result;
    }

}

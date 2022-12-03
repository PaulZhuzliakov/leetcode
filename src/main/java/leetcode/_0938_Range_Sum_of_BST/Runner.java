package leetcode._0938_Range_Sum_of_BST;

public class Runner {

    public static void main(String[] args) {
        TreeNode ll = new TreeNode(3);
        TreeNode lr = new TreeNode(7);
        TreeNode rr = new TreeNode(18);

        TreeNode l = new TreeNode(5, ll, lr);
        TreeNode r = new TreeNode(15, null, rr);

        TreeNode root = new TreeNode(10, l, r);

        int result = new Solution().rangeSumBST(root, 7, 15);
        System.out.println(result);
    }
}

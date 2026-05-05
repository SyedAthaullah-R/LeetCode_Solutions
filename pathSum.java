// Time Complexity: O(n)
public class pathSum {
    boolean res = false;

    public TreeNode foundTarget(TreeNode root, int targetSum, int sum) {
        if (root == null)
            return null;
        sum += root.val;
        TreeNode left = foundTarget(root.left, targetSum, sum);
        TreeNode right = foundTarget(root.right, targetSum, sum);
        if (left == null & right == null && sum == targetSum)
            res = true;
        return root;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        foundTarget(root, targetSum, 0);
        return res;
    }
}

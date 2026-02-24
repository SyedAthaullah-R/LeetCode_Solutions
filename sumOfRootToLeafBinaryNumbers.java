// Time Complexity: O(n)
public class sumOfRootToLeafBinaryNumbers {
    public int getRootSum(TreeNode root, int val) {
        if (root == null)
            return 0;
        val = 2 * val + (1 * root.val);
        if (root.left == null && root.right == null)
            return val;
        return getRootSum(root.left, val) + getRootSum(root.right, val);
    }

    public int sumRootToLeaf(TreeNode root) {
        return getRootSum(root, 0);
    }
}

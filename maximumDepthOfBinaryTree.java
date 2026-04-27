// Time Complexity: O(n)
public class maximumDepthOfBinaryTree {
    int maxD;

    public void depth(TreeNode root, int d) {
        if (root == null)
            return;
        maxD = Math.max(maxD, d);
        depth(root.left, d + 1);
        depth(root.right, d + 1);
    }

    public int maxDepth(TreeNode root) {
        depth(root, 1);
        return maxD;
    }
}

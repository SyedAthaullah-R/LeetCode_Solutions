// Time Complexity: O(n)
public class flattenBinaryTreeToLinkedList {
    public TreeNode dfs(TreeNode root) {
        if (root == null)
            return null;
        TreeNode leftTail = dfs(root.left);
        TreeNode rightTail = dfs(root.right);
        if (root.left != null) {
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if (rightTail != null)
            return rightTail;
        else if (leftTail != null)
            return leftTail;
        else
            return root;
    }

    public void flatten(TreeNode root) {
        dfs(root);
    }
}

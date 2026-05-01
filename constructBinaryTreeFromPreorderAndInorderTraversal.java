// Time Complxity: O(n²)
public class constructBinaryTreeFromPreorderAndInorderTraversal {
    int ind = 0;

    public TreeNode solve(int[] preorder, int[] inorder, int start, int end) {
        if (start > end)
            return null;
        int rootVal = preorder[ind];
        int i = start;
        for (; i <= end; i++) {
            if (inorder[i] == rootVal)
                break;
        }
        ind++;
        TreeNode root = new TreeNode(rootVal);
        root.left = solve(preorder, inorder, start, i - 1);
        root.right = solve(preorder, inorder, i + 1, end);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return solve(preorder, inorder, 0, n - 1);
    }
}

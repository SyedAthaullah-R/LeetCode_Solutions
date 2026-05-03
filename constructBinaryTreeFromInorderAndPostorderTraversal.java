// Time Complexity: O(n²)
public class constructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode solve(int[] inorder, int[] postorder, int inSt, int inEnd, int postSt, int postEnd) {
        if (inSt > inEnd)
            return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int i = inSt;
        for (; i <= inEnd; i++) {
            if (inorder[i] == root.val)
                break;
        }
        int leftSize = i - inSt;
        int rightSize = inEnd - i;
        root.left = solve(inorder, postorder, inSt, i - 1, postSt, postSt + leftSize - 1);
        root.right = solve(inorder, postorder, i + 1, inEnd, postEnd - rightSize, postEnd - 1);
        return root;

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return solve(inorder, postorder, 0, n - 1, 0, n - 1);
    }
}

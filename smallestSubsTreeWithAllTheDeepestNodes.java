
// Time Complexity: O(n)
import java.util.HashMap;

public class smallestSubsTreeWithAllTheDeepestNodes {
    int maxD;
    HashMap<Integer, Integer> map = new HashMap<>();

    public void depth(TreeNode node, int d) {
        if (node == null)
            return;
        maxD = Math.max(maxD, d);
        map.put(node.val, d);
        depth(node.left, d + 1);
        depth(node.right, d + 1);
    }

    public TreeNode LCA(TreeNode root) {
        if (root == null || map.get(root.val) == maxD)
            return root;
        TreeNode l = LCA(root.left);
        TreeNode r = LCA(root.right);
        if (l != null && r != null)
            return root;
        return l != null ? l : r;
    }

    public TreeNode subTreeWithAllDeepest(TreeNode root) {
        depth(root, 0);
        return LCA(root);
    }
}

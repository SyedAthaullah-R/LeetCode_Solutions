
// Time Complexity: O(n)
import java.util.LinkedList;
import java.util.Queue;

public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode res = root;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                TreeNode node = q.poll();
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
            }
        }
        return res;
    }
}

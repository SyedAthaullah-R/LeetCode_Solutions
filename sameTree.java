
// Time Complexity: O(n)
import java.util.LinkedList;
import java.util.Queue;

public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(q);
        q2.add(q);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            int size1 = q1.size(), size2 = q2.size();
            while (size1-- > 0 && size2-- > 0) {
                TreeNode node1 = q1.poll(), node2 = q2.poll();
                if (node1 == null && node2 == null)
                    continue;
                if (node1 == null || node2 == null || node1.val != node2.val)
                    return false;
                q1.add(node1.left);
                q1.add(node1.right);
                q2.add(node2.left);
                q2.add(node2.right);
            }
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}

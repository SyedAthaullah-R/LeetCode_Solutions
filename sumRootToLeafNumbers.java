
// Time Complexity: O(n)
import java.util.ArrayList;
import java.util.List;

public class sumRootToLeafNumbers {
    List<Integer> res = new ArrayList<>();

    public TreeNode dfs(TreeNode root, int sum) {
        if (root == null)
            return null;
        sum = (sum * 10) + root.val;
        TreeNode left = dfs(root.left, sum);
        TreeNode right = dfs(root.right, sum);
        if (left == null && right == null)
            res.add(sum);
        return root;
    }

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        int sum = 0;
        for (int i : res)
            sum += i;
        return sum;
    }
}

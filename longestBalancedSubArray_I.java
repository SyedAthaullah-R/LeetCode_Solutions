
// Time Complexity: O(n²)
import java.util.HashSet;

public class longestBalancedSubArray_I {
    public int longestBalanced(int[] nums) {
        if (nums.length == 1)
            return 0;
        int l = 0, res = 0;
        while (l < nums.length) {
            HashSet<Integer> evenSet = new HashSet<>(), oddSet = new HashSet<>();
            for (int r = l; r < nums.length; r++) {
                if (nums[r] % 2 == 0)
                    evenSet.add(nums[r]);
                else if (nums[r] % 2 != 0)
                    oddSet.add(nums[r]);
                if (evenSet.size() == oddSet.size())
                    res = Math.max(res, r - l + 1);
            }
            l++;
        }
        return res;
    }

    public static void main(String[] args) {
        longestBalancedSubArray_I a = new longestBalancedSubArray_I();
        int[] nums = { 2, 5, 4, 3 };
        System.out.println(a.longestBalanced(nums));
    }
}

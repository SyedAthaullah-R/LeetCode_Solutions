
// Time Complexity: o(n log n)
import java.util.Arrays;

public class minimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        int res = 0;
        while (l < r) {
            int sum = nums[l] + nums[r];
            res = Math.max(res, sum);
            l++;
            r--;
        }
        return res;
    }

    public static void main(String[] args) {
        minimizeMaximumPairSumInArray a = new minimizeMaximumPairSumInArray();
        int[] nums = { 3, 5, 2, 3 };
        System.out.println(a.minPairSum(nums));
    }
}

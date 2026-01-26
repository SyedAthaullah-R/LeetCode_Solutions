
// Time Complexity: o(n log n)
import java.util.Arrays;

public class minimumDifferenceBetweenHighestAndLowestOfKScores {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int l = 0, r = k - 1;
        while (r < nums.length) {
            int minVal = nums[l];
            int maxVal = nums[r];
            res = Math.min(res, maxVal - minVal);
            l++;
            r++;
        }
        return res;
    }

    public static void main(String[] args) {
        minimumDifferenceBetweenHighestAndLowestOfKScores a = new minimumDifferenceBetweenHighestAndLowestOfKScores();
        int[] nums = { 9, 4, 1, 7 };
        System.out.println(a.minimumDifference(nums, 2));
    }
}

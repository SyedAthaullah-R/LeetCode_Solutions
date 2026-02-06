
// Time Complexity: O(n log n)
import java.util.Arrays;

public class minimumRemovalsToBalanceArray {
    public int minRemoval(int[] nums, int k) {
        if (nums.length == 1)
            return 0;
        Arrays.sort(nums);
        int l = 0, r = 1, maxWin = 0;
        while (r < nums.length) {
            while (l < r && nums[r] > (long) k * nums[l])
                l++;
            maxWin = Math.max(maxWin, r - l + 1);
            r++;
        }
        return nums.length - maxWin;
    }

    public static void main(String[] args) {
        minimumRemovalsToBalanceArray a = new minimumRemovalsToBalanceArray();
        int[] nums = { 1, 6, 2, 9 };
        System.out.println(a.minRemoval(nums, 3));
    }
}
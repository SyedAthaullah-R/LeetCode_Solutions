
// Time Complexity: O(n)
import java.util.Arrays;

public class runningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] = nums[i] + nums[i - 1];
        return nums;
    }

    public static void main(String[] args) {
        runningSumOf1dArray a = new runningSumOf1dArray();
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(a.runningSum(nums)));
    }
}

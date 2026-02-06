
// Time Complexity: O(n)
import java.util.Arrays;

public class transformedArray {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int ind = (i + nums[i]) % n;
            if (ind < 0)
                ind += n;
            res[i] = nums[ind];
        }
        return res;
    }

    public static void main(String[] args) {
        transformedArray a = new transformedArray();
        int[] nums = { 3, -2, 1, 1 };
        System.out.println(Arrays.toString(a.constructTransformedArray(nums)));
    }
}

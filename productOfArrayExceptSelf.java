// Time Complexity: O(n)
import java.util.Arrays;

public class productOfArrayExceptSelf {
    public int[] product_Of_Array_Except_Self(int[] nums){
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        for(int i = 1; i < nums.length; i++)
            left[i] = left[i - 1] * nums[i - 1];
        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--)
            right[i] = right[i + 1] * nums[i + 1];
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            res[i] = left[i] * right[i];
        return res;

    }
    public static void main(String[] args) {
        productOfArrayExceptSelf a = new productOfArrayExceptSelf();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(a.product_Of_Array_Except_Self(nums)));
    }
}

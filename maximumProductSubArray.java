// Time Complexity: O(n)                                                                                                                            .

public class maximumProductSubArray {
    public int maxmimum_Product_SubArray(int[] nums){
        int prefix = 1, suffix = 1, max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 1) suffix = 1;
            prefix *= nums[i];
            suffix *= nums[nums.length - i - 1];
            max = Math.max(max, Math.max(prefix, suffix));
        }return max;
    }
    public static void main(String[] args) {
        maximumProductSubArray a = new maximumProductSubArray();
        int[] nums = {2, 3, -1, 4};
        System.out.println(a.maxmimum_Product_SubArray(nums));
    }
}

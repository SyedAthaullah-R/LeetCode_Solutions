// Time Complexity: O(n)
public class maximumSubArray {
    public int maximum_Subarray(int[] nums){
        int sum = nums[0], res = sum;
        for(int i = 0; i < nums.length; i++){
            if(sum < 0) sum = nums[i];
            else sum += nums[i];
            res = Math.max(res, sum);
        } return res;
    }
    public static void main(String[] args) {
        maximumSubArray a = new maximumSubArray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(a.maximum_Subarray(nums));
    }
}

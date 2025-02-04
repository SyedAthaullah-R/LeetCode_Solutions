//  Time Complexity: O(n)

public class maximumAscendingSubarraySum {
    public int maximum_Ascending_Subarray_Sum(int[] nums){
        int sum = nums[0], max = sum;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]) sum += nums[i];
            else sum = nums[i];
            max = Math.max(max, sum);
        } return max;
    }
    public static void main(String[] args) {
        maximumAscendingSubarraySum a = new maximumAscendingSubarraySum();
        int[] nums = {10, 20, 30, 5, 10, 50};
        System.out.println(a.maximum_Ascending_Subarray_Sum(nums));
        
    }
}

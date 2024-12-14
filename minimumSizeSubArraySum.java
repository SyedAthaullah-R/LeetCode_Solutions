// Time Complexity: O(n)

public class minimumSizeSubArraySum {

    public int minumum_Size_Subarray(int[] nums, int target){
        int l = 0, sum = 0, min = Integer.MAX_VALUE;
        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            while(sum >= target){
                min = Math.min(min, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }return min == Integer.MAX_VALUE ? 0 : min;
    }
    public static void main(String[] args) {
        minimumSizeSubArraySum a = new minimumSizeSubArraySum();
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(a.minumum_Size_Subarray(nums, 7));
    }
}
// Time Complexity: O(n)
public class maximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums){
        int res = - 1, minValue = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > minValue) res = Math.max(res, nums[i] - minValue);
            minValue = Math.min(minValue, nums[i]);
        } return res;
    }
    public static void main(String[] args) {
        maximumDifferenceBetweenIncreasingElements a = new maximumDifferenceBetweenIncreasingElements();
        int[] nums = {7, 1, 5, 4};
        System.out.println(a.maximumDifference(nums));
    }
}

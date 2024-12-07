// Time Complexity: O(n)

public class maximumAverageSubArray {
    public double maximum_Average_SubArray(int[] nums, int k){
        int sum = 0;
        for(int i = 0; i < k; i++)
            sum += nums[i];
        int maxSum = sum;
        int leftIndex = 0, rightIndex = k;
        while(rightIndex < nums.length){
            sum -= nums[leftIndex];
            leftIndex++;
            sum += nums[rightIndex];
            rightIndex++;
            maxSum = Math.max(maxSum, sum);
        }return (double) maxSum / k;
    }
    public static void main(String[] args) {
        maximumAverageSubArray a = new maximumAverageSubArray();
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(a.maximum_Average_SubArray(nums, 4));
    }

}

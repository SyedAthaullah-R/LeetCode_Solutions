// Time Complexity: O(n)
public class divideAnArrayIntoSubArraysWithMinimumCost_I {
    public int minimumCost(int[] nums) {
        int min = Integer.MAX_VALUE, secMin = min;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                secMin = min;
                min = nums[i];
            } else if (nums[i] < secMin && nums[i] >= min)
                secMin = nums[i];
        }
        return nums[0] + min + secMin;
    }

    public static void main(String[] args) {
        divideAnArrayIntoSubArraysWithMinimumCost_I a = new divideAnArrayIntoSubArraysWithMinimumCost_I();
        int[] nums = { 1, 2, 3, 12 };
        System.out.println(a.minimumCost(nums));
    }
}

// Time Complexity: O(n)
public class maximumDiffernceBetweenAdjacentElementsIn_a_CircularArray {
    public int maxAdjacentDiffernce(int[] nums){
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
            res = Math.max(res, Math.abs(nums[i] - nums[(i + 1) % nums.length]));
        return res;
    }
    public static void main(String[] args) {
        maximumDiffernceBetweenAdjacentElementsIn_a_CircularArray a = new maximumDiffernceBetweenAdjacentElementsIn_a_CircularArray();
        int[] nums = {1, 2, 4};
        System.out.println(a.maxAdjacentDiffernce(nums));
    }
}

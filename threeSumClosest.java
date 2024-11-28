import java.util.Arrays;

public class threeSumClosest {
    public int three_Sum_Closest(int[] nums, int target){
        int closestNum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int p1 = i + 1;
            int p2 = nums.length - 1;
            while(p1 < p2){
                int sum = nums[i] + nums[p1] + nums[p2];
                if(Math.abs(target - sum) < Math.abs(target - closestNum)) closestNum = sum;
                if(sum > target)  p2--;
                else if(sum < target) p1++;
                else return sum;
            }
        }return closestNum;
    }
    public static void main(String[] args) {
        threeSumClosest a = new threeSumClosest();
        int[] nums = {1, 1, 1, 0};
        System.out.println(a.three_Sum_Closest(nums, 1));
    }
}

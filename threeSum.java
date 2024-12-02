// The Time Complexity:
// Best Case: O(1)
// Average and worst case is O(n²)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public List<List<Integer>> three_Sum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int p1 = i + 1;
            int p2 = nums.length -1;
            while(p1 < p2){
            int sum = nums[i] + nums[p1] + nums[p2];
            if(sum == 0){
                res.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                while(p1 < p2 && nums[p1] == nums[p1 + 1]) p1++;
                while(p1 < p2 && nums[p2] == nums[p2 - 1]) p2--;
                p1++;
                p2--;
            }else if(sum < 0) p1++;
            else p2--;
        }
    }return res;
    }
    public static void main(String[] args) {
        threeSum a = new threeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(a.three_Sum(nums));
    }
}

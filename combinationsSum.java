// Time Complexity: O(N ∗ 2ᵀ)
import java.util.List;
import java.util.ArrayList;
public class combinationsSum {
    List<List<Integer>> res;
    public void backTrack(int[] nums, int target, List<Integer> curr, int i){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0 || i >= nums.length) return;

        curr.add(nums[i]);
        backTrack(nums, target - nums[i], curr, i);
        curr.remove(curr.size() - 1);
        backTrack(nums, target, curr, i + 1);
    }
    public List<List<Integer>> combinations_Sum(int[] candidates, int target){
        res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backTrack(candidates, target, curr, 0);
        return res;
    }
    public static void main(String[] args) {
        combinationsSum a = new combinationsSum();
        int [] candidates = {2, 3, 6, 7};
        System.out.println(a.combinations_Sum(candidates, 7));
        
    }
}

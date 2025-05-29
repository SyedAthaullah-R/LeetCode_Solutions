// Time Complexity: O(n² * 2ⁿ)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSets_II {
    public void backTrack(List<List<Integer>> res, List<Integer> tempSet, int[] nums, int start){
        if(res.contains(tempSet)) return;
        res.add(new ArrayList<>(tempSet));
        for(int i = start; i < nums.length; i++){
            tempSet.add(nums[i]);
            backTrack(res, tempSet, nums, i + 1);
            tempSet.remove(tempSet.size() - 1);
        }
    }
    public List<List<Integer>> subSetsII(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    public static void main(String[] args) {
        subSets_II a = new subSets_II();
        int[] nums = {1, 2, 2};
        System.out.println(a.subSetsII(nums));
    }
}

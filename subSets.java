// Time Complexity: O(n * n²)

import java.util.ArrayList;
import java.util.List;

public class subSets {
    public void backTrack(List<List<Integer>> res, List<Integer> tempSet, int[] nums, int start){
        res.add(new ArrayList<>(tempSet));
        for(int i = start; i < nums.length; i++){
            tempSet.add(nums[i]);
            backTrack(res, tempSet, nums, i + 1);
            tempSet.remove(tempSet.size() - 1);
        }
    }
    public static void main(String[] args) {
        subSets a = new subSets();
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = {1, 2, 3};
        a.backTrack(res, new ArrayList<>(), nums, 0);
        System.out.println(res);
        
    }
}

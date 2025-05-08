// Time Complexity: O(n * n!)
import java.util.ArrayList;
import java.util.List;

public class permutation {
    public void backTrack(List<List<Integer>> res, ArrayList<Integer> tempSet, int[] nums){
        if(tempSet.size() == nums.length){
            res.add(new ArrayList<>(tempSet));
            return;
        }
        for(int i : nums){
            if(tempSet.contains(i)) continue;
            tempSet.add(i);
            backTrack(res, tempSet, nums);
            tempSet.remove(tempSet.size() - 1);
        }
    }
    public static void main(String[] args) {
        permutation a = new permutation();
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = {1, 2, 3};
        a.backTrack(res, new ArrayList<>(), nums);
        System.out.println(res);
    }
}

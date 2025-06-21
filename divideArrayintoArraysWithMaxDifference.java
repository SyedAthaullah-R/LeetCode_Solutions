// Time Complexity: O(n log n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class divideArrayintoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int r = 0;
        while(r + 2 < nums.length){
            if(nums[r + 2] - nums[r] <= k){
                res.add(Arrays.asList(nums[r], nums[r + 1], nums[r + 2]));
                r += 3;
            }
            else return new int[0][];
        }
        int[][] result = new int[res.size()][3];
        for(int i = 0; i < res.size(); i++){
            for(int j = 0; j < 3; j++){
                result[i][j] = res.get(i).get(j);
            }
        } return result;
    }
    public static void main(String[] args) {
        divideArrayintoArraysWithMaxDifference a = new divideArrayintoArraysWithMaxDifference();
        int[] nums = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        System.out.println(Arrays.deepToString(a.divideArray(nums, 2))); 
    }
}

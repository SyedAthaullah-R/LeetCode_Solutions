// Time Complexity: O(n)
import java.util.ArrayList;
import java.util.List;

public class findAllKDistantIndicesInAnArray {
    public List<Integer> find_Distant_Indices(int[] nums, int key, int k){
        int n = nums.length;
        boolean[] valid = new boolean[n];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key){
                int start = Math.max(0, i - k);
                int end = Math.min(n - 1, i + k);
                for(int j = start; j <= end; j++) valid[j] = true;

            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++)
            if(valid[i]) res.add(i);
        return res;
    }
    public static void main(String[] args) {
        findAllKDistantIndicesInAnArray a = new findAllKDistantIndicesInAnArray();
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        System.out.println(a.find_Distant_Indices(nums, 9, 1));
        
    }
}

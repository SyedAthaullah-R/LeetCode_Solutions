import java.util.HashMap;
import java.util.Arrays;
public class two_numbers {
    public static void main(String[] args){
        Solution a = new Solution();
        System.out.println(Arrays.toString(a.twoSum(new int[]{2,7,11,15}, 9)) );
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i<nums.length;i++){
        int complement = target - nums[i];
        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};

        }
        map.put(nums[i],i);
       }
       return null;

       
    }
    
}
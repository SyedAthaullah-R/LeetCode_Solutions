// Time Complexity: O(n)
import java.util.HashMap;

public class degreeOfAnArray {
    public int findShortestSubArray(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int max = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
            max = Math.max(max, freq);
        }
        int res = Integer.MAX_VALUE;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq == max){
                int startInd = 0, endInd = 0;
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == key){
                        startInd = i;
                        break;
                    }
                }
                for(int i = nums.length - 1; i >= 0; i--){
                    if(nums[i] == key){
                        endInd = i;
                        break;
                    }
                }
                res = Math.min(res, endInd - startInd + 1);
            }
        } return res;
    }
    public static void main(String[] args){
        degreeOfAnArray a = new degreeOfAnArray();
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(a.findShortestSubArray(nums));
    }
}

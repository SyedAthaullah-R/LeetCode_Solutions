// Time Complexity: O(n)
import java.util.HashMap;

public class countElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int maxf = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
            maxf = Math.max(maxf, freq);
        }
        int res = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq == maxf) res += freq;
        } return res;
    }
    public static void main(String[] args){
        countElementsWithMaximumFrequency a = new countElementsWithMaximumFrequency();
        int[] nums = {1, 2, 2, 3, 1, 4};
        System.out.println(a.maxFrequencyElements(nums));
    }
}

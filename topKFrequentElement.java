// Time Complexity : O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class topKFrequentElement {
    public int[] top_K_FrequentElement(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null)  bucket[freq] =  new ArrayList<>();
            bucket[freq].add(key);
        }
        int[] res = new int[k];
        int count = 0;
        for(int i = bucket.length - 1; i >= 0 && count < k; i--){
            if(bucket[i] != null){
                for(Integer integer : bucket[i]){
                    res[count++] = integer;
                    if(count == k) break;
                }
            }
        }return res;

    }
    public static void main(String[] args) {
        topKFrequentElement a = new topKFrequentElement();
        int[] nums = {1, 1, 1, 2, 2, 3, 3};
        System.out.println(Arrays.toString(a.top_K_FrequentElement(nums, 2)));
    }
}

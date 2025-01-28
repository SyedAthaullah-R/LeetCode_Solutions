// Time Complexity: O(n)
import java.util.HashMap;

public class mostFrequentEvenElement {
    public int most_Frequent_Element(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(i % 2 == 0){
                if(map.containsKey(i)) map.put(i, map.get(i) + 1);
                else map.put(i, 1);
            }
        }
        int res = - 1, max = - 1;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > max || freq == max && res > key){
                max = freq;
                res = key;
            } 
        }return res;
    }
    public static void main(String[] args) {
        mostFrequentEvenElement a = new mostFrequentEvenElement();
        int[] nums = {0, 1, 2, 2, 4, 4, 1};
        System.out.println(a.most_Frequent_Element(nums));
        
    }
}

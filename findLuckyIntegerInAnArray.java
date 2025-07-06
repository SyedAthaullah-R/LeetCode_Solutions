// Time Complexity: O(n)
import java.util.HashMap;

public class findLuckyIntegerInAnArray {
    public int findLucky(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = - 1;
        for(int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq == key) res = Math.max(res, key);
        } return res;
    }
    public static void main(String[] args) {
        findLuckyIntegerInAnArray a = new findLuckyIntegerInAnArray();
        int[] arr = {2, 2, 3, 4};
        System.out.println(a.findLucky(arr));
    }
}

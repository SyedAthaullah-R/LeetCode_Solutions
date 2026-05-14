
// Time Complexity: O(n)
import java.util.HashMap;

public class checkIfArrayIsGood {
    public boolean isGood(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i : nums)
            max = Math.max(max, i);
        if (max + 1 != nums.length)
            return false;
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int maxEleFreq = 0;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (key != max && freq >= 2)
                return false;
            if (key == max)
                maxEleFreq = freq;
        }
        return maxEleFreq == 2;
    }

    public static void main(String[] args) {
        checkIfArrayIsGood a = new checkIfArrayIsGood();
        int[] nums = { 1, 2, 3, 3 };
        System.out.println(a.isGood(nums));
    }
}

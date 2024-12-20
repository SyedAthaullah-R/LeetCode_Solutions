// Time Complexity: O(n)
import java.util.HashMap;

public class longestConsecutiveSequence {
    public int longest_Consecutive_Sequence(int[] nums){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i : nums)
            map.put(i, Boolean.FALSE);
        int longLen = 0;
        for(int i : nums){
            int currLen = 1, nextNum = i + 1;
            while(map.containsKey(nextNum) && map.get(nextNum) == false){
                currLen++;
                map.put(nextNum, Boolean.TRUE);
                nextNum++;
            }
            int prevNum = i - 1;
            while(map.containsKey(prevNum) && map.get(prevNum) == false){
                currLen++;
                map.put(prevNum, Boolean.TRUE);
                prevNum--;
            }
            longLen = Math.max(longLen, currLen);
        }return longLen;
    }
    public static void main(String[] args) {
        longestConsecutiveSequence a = new longestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(a.longest_Consecutive_Sequence(nums));
    }
}

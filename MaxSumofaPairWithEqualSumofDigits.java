// Time Complexity: O(n)

import java.util.HashMap;
public class MaxSumofaPairWithEqualSumofDigits {
    private int findSumDigit(int n){
        int sum = 0;
        while(n > 0){
            sum = sum + n % 10;
            n /= 10;
        } return sum;
    }
    public int Max_Sum_Pair_With_Equal_Sum_Of_Digits(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = - 1;
        for(int i : nums){
            int sumDigit = findSumDigit(i);
            if(map.containsKey(sumDigit)){
                maxLen = Math.max(maxLen, map.get(sumDigit) + i);
                if(map.get(sumDigit) < i) map.put(sumDigit, i);
            }
            else map.put(sumDigit, i);
        } return maxLen;
    }
    public static void main(String[] args) {
        MaxSumofaPairWithEqualSumofDigits a = new MaxSumofaPairWithEqualSumofDigits();
        int[] nums = {18, 43, 36, 13, 7};
        System.out.println(a.Max_Sum_Pair_With_Equal_Sum_Of_Digits(nums));
    }

}

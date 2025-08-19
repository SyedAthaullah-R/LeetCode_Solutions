// Time Complexity: O(n)
public class numberOfZeroFilledSubArray {
    public long zeroFilledSubArray(int[] nums){
        long res = 0, count = 0;
        for(int i : nums){
            if(i == 0) count++;
            else count = 0;
            res += count;
        } return res;
    }
    public static void main(String[] args){
        numberOfZeroFilledSubArray a = new numberOfZeroFilledSubArray();
        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4,};
        System.out.println(a.zeroFilledSubArray(nums));
    }
}

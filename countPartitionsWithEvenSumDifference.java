// Time Complexity: O(n)
public class countPartitionsWithEvenSumDifference {
    public int coutnPartitions(int[] nums){
        int sum = 0;
        for(int i : nums)
            sum += i;
        return sum % 2 == 0 ? nums.length - 1 : 0;
    }
    public static void main(String[] args){
        countPartitionsWithEvenSumDifference a = new countPartitionsWithEvenSumDifference();
        int[] nums = {10, 10, 3, 7, 6};
        System.out.println(a.coutnPartitions(nums));

    }
}

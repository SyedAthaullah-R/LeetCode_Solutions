// Time Complexity: O(n)
import java.util.Arrays;

public class convertIntegerToSumOfTwoNoZerosInteger {
    public int[] getNoZeroIntegers(int n){
        int l = 1, r = n - 1;
        while(l <= r){
            int sum = l + r;
            if(sum == n && !String.valueOf(l).contains("0") && !String.valueOf(r).contains("0")) return new int[]{l, r};
            else if(sum < n) l++;
            else r--;
        } return new int[]{0, 0};
    }
    public static void main(String[] args){
        convertIntegerToSumOfTwoNoZerosInteger a = new convertIntegerToSumOfTwoNoZerosInteger();
        System.out.println(Arrays.toString(a.getNoZeroIntegers(2)));
    }
}

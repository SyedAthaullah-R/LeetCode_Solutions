// The Time Complexity for this is 
// Best Case : O(1)
// Average and the Worst case : O(n)
import java.util.Arrays;

public class plusOne {
    public int[] plus_one(int[] digits){
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
    public static void main(String[] args) {
        plusOne a = new plusOne();
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(a.plus_one(digits)));
    }
}

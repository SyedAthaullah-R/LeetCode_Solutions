// The time Complexity is
// Best Case : O(1)
// Average and Worst Case : O(n)
import java.util.Arrays;
public class twoSums2 {
    public int[] two_Sums_2(int[] numbers, int target){
        int p1 = 0;
        int p2 = numbers.length - 1;
        while(p1 < p2){
            if(numbers[p1] + numbers[p2] == target) return new int[]{p1 + 1, p2 + 1};
            else if(numbers[p1] + numbers[p2] > target) p2--;
            else p1++;
        }return null;
    }
    public static void main(String[] args) {
        twoSums2 a = new twoSums2();
        int[] numbers = {2,7,11,15};
        System.out.println (Arrays.toString((a.two_Sums_2(numbers,9))));
    }
}

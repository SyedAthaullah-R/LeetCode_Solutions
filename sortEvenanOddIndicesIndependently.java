// Time Complexity: O(n log n)
import java.util.Arrays;

public class sortEvenanOddIndicesIndependently {
    public int[] sortEvenOdd(int[] nums){
        int n = nums.length;
        int[] evenInd = new int[(n + 1) / 2], oddInd = new int[n / 2];
        int evenI = 0, oddI = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0) evenInd[evenI++] = nums[i];
            else oddInd[oddI++] = nums[i]; 
        }
        Arrays.sort(evenInd);
        Arrays.sort(oddInd);
        int[] res = new int[nums.length];
        evenI = 0;
        oddI = oddInd.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0) res[i] = evenInd[evenI++];
            else res[i] = oddInd[oddI--];
        } return res;
    }
    public static void main(String[] args) {
        sortEvenanOddIndicesIndependently a = new sortEvenanOddIndicesIndependently();
        int[] nums = {4, 1, 2, 3};
        System.out.println(Arrays.toString(a.sortEvenOdd(nums)));
    }
}

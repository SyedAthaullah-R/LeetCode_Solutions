// Time Complexity: O(n)
import java.util.Arrays;

public class findNUniqueIntegersSumUptoZero {
    public int[] sumZero(int n){
        int[] res = new int[n];
        int count = 0;
        for(int i = n / 2; i > 0; i--){
            res[count++] = - i;
            res[count++] = i;
        } return res;
    }
    public static void main(String[] args){
        findNUniqueIntegersSumUptoZero a = new findNUniqueIntegersSumUptoZero();
        System.out.println(Arrays.toString(a.sumZero(5)));
    }
}

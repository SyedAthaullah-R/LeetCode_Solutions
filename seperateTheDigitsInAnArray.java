
// Time Complexity: O(d)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class seperateTheDigitsInAnArray {
    public int[] seperateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            List<Integer> temp = new ArrayList<>();
            while (num > 0) {
                temp.add(num % 10);
                num /= 10;
            }
            for (int i = temp.size() - 1; i >= 0; i--)
                res.add(temp.get(i));
        }
        int[] res1 = new int[res.size()];
        for (int i = 0; i < res1.length; i++)
            res1[i] = res.get(i);
        return res1;
    }

    public static void main(String[] args) {
        seperateTheDigitsInAnArray a = new seperateTheDigitsInAnArray();
        int[] nums = { 13, 25, 83, 77 };
        System.out.println(Arrays.toString(a.seperateDigits(nums)));
    }
}

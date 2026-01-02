
// Time Complexity: O(n)
import java.util.HashSet;

public class nRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums)
            if (!set.add(i))
                return i;
        return 0;
    }

    public static void main(String[] args) {
        nRepeatedElementInSize2NArray a = new nRepeatedElementInSize2NArray();
        int[] nums = { 1, 2, 3, 3 };
        System.out.println(a.repeatedNTimes(nums));
    }
}

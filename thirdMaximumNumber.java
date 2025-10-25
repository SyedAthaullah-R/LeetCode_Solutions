// Time Complexity: O(n log n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class thirdMaximumNumber {
    public int thirdMax(int[] nums){
        Arrays.sort(nums);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i : nums)
            set.add(i);
        List<Integer> res = new ArrayList<>(set);
        return res.size() > 2 ? res.get(res.size() - 3) : res.get(res.size() == 1 ? 0 : 1);
    }
    public static void main(String[] args){
        thirdMaximumNumber a = new thirdMaximumNumber();
        int[] nums = {3, 2, 1};
        System.out.println(a.thirdMax(nums));
    }
}

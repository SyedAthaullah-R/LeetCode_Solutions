
// Time Complexity: O(n²)
import java.util.ArrayList;
import java.util.List;

public class minimumPairRemovalToSortArrayI {
    public boolean isSorted(List<Integer> res) {
        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i) > res.get(i + 1))
                return false;
        }
        return true;
    }

    public int minPairSum(List<Integer> res) {
        int ind = -1, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i) + res.get(i + 1) < minSum) {
                ind = i;
                minSum = res.get(i) + res.get(i + 1);
            }
        }
        return ind;
    }

    public int minimumPairRemoval(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int operations = 0;
        for (int i : nums)
            res.add(i);
        while (!isSorted(res)) {
            int ind = minPairSum(res);
            res.set(ind, res.get(ind) + res.get(ind + 1));
            res.remove(ind + 1);
            operations++;
        }
        return operations;
    }

    public static void main(String[] args) {
        minimumPairRemovalToSortArrayI a = new minimumPairRemovalToSortArrayI();
        int[] nums = { 5, 2, 3, 1 };
        System.out.println(a.minimumPairRemoval(nums));
    }
}

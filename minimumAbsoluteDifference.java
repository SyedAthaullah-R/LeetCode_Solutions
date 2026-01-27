
// Time Complexity: O(n log n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++)
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        minimumAbsoluteDifference a = new minimumAbsoluteDifference();
        int[] arr = { 4, 2, 1, 3 };
        System.out.println(a.minimumAbsDifference(arr));
    }
}


// Time Complexity: O((m + n) * d²)
import java.util.HashSet;

public class findTheLengthOfTheLongestCommmPrefix {
    public int longestCommomPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        for (int i : arr1) {
            String s = String.valueOf(i);
            for (int num = 0; num < s.length(); num++)
                set.add(s.substring(0, num + 1));
        }
        int res = 0;
        for (int i : arr2) {
            String s = String.valueOf(i);
            for (int num = 0; num < s.length(); num++) {
                String prefix = s.substring(0, num);
                if (set.contains(prefix))
                    res = Math.max(res, prefix.length());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findTheLengthOfTheLongestCommmPrefix a = new findTheLengthOfTheLongestCommmPrefix();
        int[] arr1 = { 1, 10, 1000 }, arr2 = { 1000 };
        System.out.println(a.longestCommomPrefix(arr1, arr2));
    }
}

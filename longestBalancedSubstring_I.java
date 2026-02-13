// Time Complexity: O(n²)
public class longestBalancedSubstring_I {
    public boolean isBalanced(int[] count, int maxFreq) {
        for (int i : count) {
            if (i == 0)
                continue;
            if (i != maxFreq)
                return false;
        }
        return true;
    }

    public int longestBalanced(String s) {
        if (s.length() == 1)
            return 1;
        int l = 0, res = 0;
        while (l < s.length()) {
            int[] count = new int[26];
            int maxFreq = 0;
            for (int r = l; r < s.length(); r++) {
                int val = s.charAt(r) - 'a';
                count[val]++;
                maxFreq = Math.max(maxFreq, count[val]);
                if (isBalanced(count, maxFreq))
                    res = Math.max(res, r - l + 1);
            }
            l++;
        }
        return res;
    }

    public static void main(String[] args) {
        longestBalancedSubstring_I a = new longestBalancedSubstring_I();
        System.out.println(a.longestBalanced("abbac"));
    }
}

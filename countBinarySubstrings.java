// Time Complexity: O(n)
public class countBinarySubstrings {
    public int count_Binary_Substrings(String s) {
        int res = 0, curr = 1, prev = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                curr++;
            else {
                res += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }
        res += Math.min(curr, prev);
        return res;
    }

    public static void main(String[] args) {
        countBinarySubstrings a = new countBinarySubstrings();
        System.out.println(a.count_Binary_Substrings("00110011"));
    }
}

// Time Complexity: O(n)
public class numberOfSubstringsContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int l = 0, n = s.length();
        int res = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            count[c - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res += n - r;
                count[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        numberOfSubstringsContainingAllThreeCharacters a = new numberOfSubstringsContainingAllThreeCharacters();
        System.out.println(a.numberOfSubstrings("abcabc"));
    }
}

// Time Complexity: O(n)
public class reverseOnlyLetters {
    public String reverse_Only_Letters(String s) {
        char[] res = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetter(s.charAt(l)))
                l++;
            while (l < r && !Character.isLetter(s.charAt(r)))
                r--;
            char temp = res[l];
            res[l] = res[r];
            res[r] = temp;
            l++;
            r--;
        }
        return new String(res);
    }

    public static void main(String[] args) {
        reverseOnlyLetters a = new reverseOnlyLetters();
        System.out.println(a.reverse_Only_Letters("ab-cd"));
    }
}

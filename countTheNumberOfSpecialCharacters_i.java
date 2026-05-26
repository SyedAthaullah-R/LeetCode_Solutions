// Time Complexity: O(n)
public class countTheNumberOfSpecialCharacters_i {
    public int numberOfSpecialChars(String word) {
        boolean[] smallChar = new boolean[26], bigChar = new boolean[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c))
                bigChar[c - 'A'] = true;
            else
                smallChar[c - 'a'] = true;
        }
        int res = 0;
        for (int i = 0; i < bigChar.length; i++) {
            if (smallChar[i] == true && bigChar[i] == true)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        countTheNumberOfSpecialCharacters_i a = new countTheNumberOfSpecialCharacters_i();
        System.out.println(a.numberOfSpecialChars("aaAbcBC"));
    }
}

// Time Complexity: O(n)
public class findSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = letters[0];
        for (char c : letters) {
            if (c > target) {
                res = c;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findSmallestLetterGreaterThanTarget a = new findSmallestLetterGreaterThanTarget();
        char[] letters = { 'c', 'f', 'j' };
        System.out.println(a.nextGreatestLetter(letters, 'a'));
    }
}

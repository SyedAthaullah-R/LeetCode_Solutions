// Time Complexity: O(m * n)
public class numberOfStringsThatAppearAsSubstringInWord {
    public int numOfString(String[] patterns, String word) {
        int res = 0;
        for (String s : patterns) {
            if (word.indexOf(s) != -1)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        numberOfStringsThatAppearAsSubstringInWord a = new numberOfStringsThatAppearAsSubstringInWord();
        String[] patterns = { "a", "abc", "bc", "d" };
        System.out.println(a.numOfString(patterns, "abc"));
    }
}

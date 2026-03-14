
// Time Complexity: O(2ⁿ)
import java.util.ArrayList;
import java.util.List;

public class theKthLexicographicalStringOfAllHappyStringsOfLengthN {
    public void backTrack(List<String> res, StringBuilder sb, int n) {
        if (sb.length() == n) {
            res.add(sb.toString());
            return;
        }
        for (char c = 'a'; c <= 'c'; c++) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
                continue;
            sb.append(c);
            backTrack(res, sb, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public String getHapptyString(int n, int k) {
        List<String> res = new ArrayList<>();
        backTrack(res, new StringBuilder(), n);
        if (res.size() < k)
            return "";
        return res.get(k - 1);
    }

    public static void main(String[] args) {
        theKthLexicographicalStringOfAllHappyStringsOfLengthN a = new theKthLexicographicalStringOfAllHappyStringsOfLengthN();
        System.out.println(a.getHapptyString(3, 9));
    }
}

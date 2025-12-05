// Time Complexity: O(n * 4ⁿ)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class letterCombinationsOfaPhoneNumber {
    public void backTrack(int i, String digits, StringBuilder sb, List<String> res, HashMap<Integer, String> map){
        if(sb.length() == digits.length()){
            res.add(sb.toString());
            return;
        }
        String chars = map.get(digits.charAt(i) - '0');
        for(char c : chars.toCharArray()){
            sb.append(c);
            backTrack(i + 1, digits, sb, res, map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits){
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) return res;
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        backTrack(0, digits, new StringBuilder(), res, map);
        return res;
    }
    public static void main(String[] args){
        letterCombinationsOfaPhoneNumber a = new letterCombinationsOfaPhoneNumber();
        System.out.println(a.letterCombinations("23"));
    }
}

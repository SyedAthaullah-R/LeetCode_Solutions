// Time Complexity: O(4ⁿ / √n)

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
    private void backTrack(int openN, int closeN, int n, List<String> res, StringBuilder stack){
        if(openN == closeN && openN == n){
            res.add(stack.toString());
            return;
        }
        if(openN < n){
            stack.append("(");
            backTrack(openN + 1, closeN, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
        if(closeN < openN){
            stack.append(")");
            backTrack(openN, closeN + 1, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
    public List<String> generate_Parentheses(int n){
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backTrack(0, 0, n, res, stack);
        return res;
    }
    public static void main(String[] args) {
        generateParentheses a = new generateParentheses();
        System.out.println(a.generate_Parentheses(2));
    }
}

import java.util.Stack;
public class validParenthesis {

        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            for (char c : s.toCharArray()) {
                if(c == '(') st.push(')');
                else if(c == '{') st.push('}');
                else if(c == '[') st.push(']');
                else if(st.isEmpty() || st.pop() != c) return false;
            }
            return st.Empty();
        }
        public static void main(String[] args) {
            validParenthesis v = new validParenthesis();
            System.out.println(v.isValid("()"));
        }
    }


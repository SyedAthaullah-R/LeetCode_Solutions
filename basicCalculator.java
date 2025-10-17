// Time Complexity: O(n)
import java.util.Stack;

public class basicCalculator {
    public int calculate(String s){
        Stack<Integer> st = new Stack<>();
        int res = 0, num = 0, sign = 1;
        for(char c : s.toCharArray()){
            if(c == '+'){
                res += sign * num;
                sign = 1;
                num = 0;
            }
            else if(c == '-'){
                res += sign * num;
                sign = - 1;
                num = 0;
            }
            else if(c == '('){
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
                num = 0;
            }
            else if(c == ')'){
                res += sign * num;
                int stSign = st.pop();
                int stNum = st.pop();
                res *= stSign;
                res += stNum;
                sign = 1;
                num = 0;
            }
            else if(Character.isDigit(c)) num = (num * 10) + c - '0';
        }
        res += sign * num;
        return res;
    }
    public static void main(String[] args){
        basicCalculator a = new basicCalculator();
        System.out.println(a.calculate("(1 + (4 + 5 + 2) - 3) + (6 + 8)"));
    }
}

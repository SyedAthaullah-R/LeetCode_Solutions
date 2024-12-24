// Time Complexity: O(n)

import java.util.Stack;

public class evaluateReversePolishNotation {
    public int rsn(String[] tokens){
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")) st.push(st.pop() + st.pop());
            else if(s.equals("-")){
                int a = st.pop(), b = st.pop();
                st.push(b - a);
            }
            else if(s.equals("*")) st.push(st.pop() * st.pop());
            else if(s.equals("/")){
                int a = st.pop(), b = st.pop();
                st.push(b / a);
            }
            else st.push(Integer.parseInt(s));
        }return st.pop();
    }
    public static void main(String[] args) {
        evaluateReversePolishNotation a = new evaluateReversePolishNotation();
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(a.rsn(tokens));
    }
}

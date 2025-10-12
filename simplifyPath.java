// Time Complexity: O(n)
import java.util.Stack;

public class simplifyPath {
    public String Simplify_Path(String path){
        Stack<String> st = new Stack<>();
        String[] words = path.split("/");
        for(String s : words){
            if(s.equals("") || s.equals(".") || st.isEmpty() && s.equals("..")) continue;
            else if(!st.isEmpty() && s.equals("..")) st.pop();
            else st.push(s);
        }
        StringBuilder sb = new StringBuilder();
        for(String s : st)
            sb.append("/").append(s);
        return sb.length() == 0 ? "/" : sb.toString();
    }
    public static void main(String[] args){
        simplifyPath a = new simplifyPath();
        System.out.println(a.Simplify_Path("/home/"));
    }
}

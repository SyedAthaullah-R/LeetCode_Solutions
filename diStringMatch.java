// Time Complexity: O(n)
import java.util.Arrays;

public class diStringMatch {
    public int[] DI_String_Match(String s){
        int iCount = 0, dCount = s.length(), count = 0;
        int[] res = new int[s.length() + 1];
        for(char c : s.toCharArray()){
            if(c == 'D') res[count++] = dCount--;
            else res[count++] = iCount++;
        }
        if(s.charAt(s.length() - 1) == 'D') res[res.length - 1] = dCount;
        else res[res.length - 1] = iCount;
        return res;
    }
    public static void main(String[] args){
        diStringMatch a = new diStringMatch();
        System.out.println(Arrays.toString(a.DI_String_Match("IDID")));
    }
}

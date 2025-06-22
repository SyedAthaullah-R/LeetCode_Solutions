// Time Complexity: O(n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class divideAStringintoGroupsOfSizeK {
    public String[] divideString(String s, int k, String fill){
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            int end = Math.min(i + k, s.length());
            String chunk = s.substring(i, end);
            if(chunk.length() < k){
                StringBuilder sb = new StringBuilder(chunk);
                while(sb.length() < k) sb.append(fill);
                chunk = sb.toString();
            }
            res.add(chunk);
            i += k;
        } return res.toArray(new String[0]);
    }
    public static void main(String[] args) {
        divideAStringintoGroupsOfSizeK a = new divideAStringintoGroupsOfSizeK();
        System.out.println(Arrays.toString(a.divideString("abcdefghij", 3, "x")));
        
    }
}

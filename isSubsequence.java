// Time Complexity: O(n)
public class isSubsequence {
    public boolean is_Subsequence(String s, String t){
        int l = 0, r = 0;
        while(l < s.length() && r < t.length()){
            if(s.charAt(l) == t.charAt(r)) l++;
            r++;
        } return l == s.length();
    }
    public static void main(String[] args) {
        isSubsequence a = new isSubsequence();
        System.out.println(a.is_Subsequence("abc", "ahbgdc"));
    }
}

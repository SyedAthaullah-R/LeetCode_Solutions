// Time Complexity:
// Best, Average and Worst Case: O(n)

import java.util.HashSet;

public class longestSubStringwithoutRepeation {
 public int longest_substring(String s){
    HashSet<Character> set = new HashSet<>();
    int l = 0, r = 0, maxLen = 0;
    while(r < s.length()){
        while(set.contains(s.charAt(r))){
            set.remove(s.charAt(l));
            l++;
        }
        set.add(s.charAt(r));
        maxLen = Math.max(maxLen, r - l + 1);
        r++;
    }return maxLen;
 }
 public static void main(String[] args) {
    longestSubStringwithoutRepeation a = new longestSubStringwithoutRepeation();
    String s = "abcdabcbb";
    System.out.println(a.longest_substring(s));
 }  
}

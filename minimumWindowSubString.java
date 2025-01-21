// Time Complexity:  O(n)

import java.util.HashMap;

public class minimumWindowSubString {
    public String minimum_window_substring(String s, String t){
        if(t.isEmpty()) return "";
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> winMap = new HashMap<>();
        for(char c : t.toCharArray())
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        int l = 0, minLen = Integer.MAX_VALUE;
        int[] res = {- 1, - 1};
        int have = 0, need = tMap.size();
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            winMap.put(c, winMap.getOrDefault(c, 0) + 1);
            if(tMap.containsKey(c) && winMap.get(c).equals(tMap.get(c))) have++;
            while(have == need){
                if((r - l + 1) < minLen){
                    minLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                char leftChar = s.charAt(l);
                winMap.put(leftChar, winMap.getOrDefault(leftChar, 0) - 1);
                if(tMap.containsKey(leftChar) && winMap.get(leftChar) < tMap.get(leftChar)) have--;
                l++;

            }
        }return minLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
        
    }
    public static void main(String[] args) {
        minimumWindowSubString a = new minimumWindowSubString();
        System.out.println(a.minimum_window_substring("ADOBECODEBANC", "ABC"));
    }
}

// Time COmplexity: O(nk)
//                  Where n is the Number of Strings and k is their Length

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {
    public List<List<String>> group_Anagram(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray())
                count[c - 'a']++;
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        groupAnagram a = new groupAnagram();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(a.group_Anagram(strs));
    }
}

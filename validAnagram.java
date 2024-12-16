//TIme Complexity : O(n) 
// Compared to HashMap, Array takes less run time and space time complexity
// import java.util.HashMap;

public class validAnagram {
    // public boolean valid_Anagram_usingHashMap(String s, String t){
    //     // Using HashMap()
    //     HashMap<Character, Integer> mapS = new HashMap<>();
    //     HashMap<Character, Integer> mapT = new HashMap<>();
    //     for(int i = 0; i < s.length(); i++){
    //         mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
    //         mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
    //     }return mapS.equals(mapT);
    // }
    public boolean valid_Anagram(String s, String t){
        int[] res = new int[26];
        for(char c : s.toCharArray())
            res[c - 'a']++;
        for(char c : t.toCharArray())
            res[c - 'a']--;
        for(int i = 0; i < res.length; i++){
            if(res[i] != 0) return false;
        }return true;

    }
    public static void main(String[] args) {
        validAnagram a = new validAnagram();
        System.out.println(a.valid_Anagram("car", "arc"));
    }
}

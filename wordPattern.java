// Time Complexity: O(n)
import java.util.HashMap;

public class wordPattern {
    public boolean Word_Pattern(String pattern, String s){
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map1 = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            char c1 = pattern.charAt(i);
            String s1 = words[i];
            if(map.containsKey(c1) && !(map.get(c1).equals(s1))) return false;
            if(map1.containsKey(s1) && map1.get(s1) != c1) return false;
            map.put(c1, s1);
            map1.put(s1, c1);
        } return true;
    }
    public static void main(String[] args){
        wordPattern a = new wordPattern();
        System.out.println(a.Word_Pattern("abba", "dog cat cat dog"));
    }
}

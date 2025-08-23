// Time Complexity: O(n)
import java.util.HashMap;

public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if((map.containsKey(c1) && map.get(c1) != c2) || (map1.containsKey(c2) && map1.get(c2) != c1)) return false;
            map.put(c1, c2);
            map1.put(c1, c2);
        } return true;
    }
    public static void main(String[] args){
        isomorphicStrings a = new isomorphicStrings();
        System.out.println(a.isIsomorphic("egg", "add"));
    }
}

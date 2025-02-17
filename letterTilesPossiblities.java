// Time Complexity: O(n!)
import java.util.HashMap;

public class letterTilesPossiblities {
    private int backTrack(HashMap<Character, Integer> map){
        int count = 0;
        for(char c : map.keySet()){
            if(map.get(c) > 0){
                count++;
                map.put(c, map.get(c) - 1);
                count += backTrack(map);
                map.put(c, map.get(c) + 1);
            }
        } return count;
    }
    public int letter_Tiles_Possiblities(String tiles){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : tiles.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        return backTrack(map);
    }
        public static void main(String[] args) {
        letterTilesPossiblities a = new letterTilesPossiblities();
        System.out.println(a.letter_Tiles_Possiblities("AAB"));
        
    }
}

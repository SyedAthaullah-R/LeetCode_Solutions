
// Time Complexity: O(n)
import java.util.HashMap;

public class maximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        String word = "balloon";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray())
            map.put(c, 0);
        for (char c : text.toCharArray()) {
            if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n')
                map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int res = Integer.MAX_VALUE;
        for (char key : map.keySet()) {
            if (key == 'l' || key == 'o')
                map.put(key, map.get(key) / 2);
            int freq = map.get(key);
            res = Math.min(res, freq);
        }
        return res;
    }

    public static void main(String[] args) {
        maximumNumberOfBalloons a = new maximumNumberOfBalloons();
        System.out.println(a.maxNumberOfBalloons("nlaebolko"));
    }
}

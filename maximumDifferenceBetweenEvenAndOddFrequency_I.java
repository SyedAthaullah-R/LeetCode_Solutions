// Time Complexity: O(n)
import java.util.HashMap;

public class maximumDifferenceBetweenEvenAndOddFrequency_I {
    public int maxDifference(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i : s.toCharArray())
            map.put(i, map.getOrDefault(i, 0) + 1);
            int a = Integer.MIN_VALUE, b = Integer.MAX_VALUE;
            for(char key : map.keySet()){
                int freq = map.get(key);
                if(freq % 2 != 0) a = Math.max(a, freq);
                else b = Math.min(a, freq);
        } return a - b;
    }
    public static void main(String[] args) {
        maximumDifferenceBetweenEvenAndOddFrequency_I a = new maximumDifferenceBetweenEvenAndOddFrequency_I();
        System.out.println(a.maxDifference("aaaaabbc"));
    }
}

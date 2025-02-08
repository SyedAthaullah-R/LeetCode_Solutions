// Time Complexity; O(n)
import java.util.*;

public class findTheNumberOfColorBalls {
    public int[] find_Distinct_Color_Among_Balls(int limit, int[][] queries){
        int n = queries.length;
        HashMap<Integer, Integer> ballColor = new HashMap<>();
        HashMap<Integer, Integer> colorFreq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int ball = queries[i][0];
            int color = queries[i][1];
            if(ballColor.containsKey(ball)){
                int prevColor = ballColor.get(ball);
                colorFreq.put(prevColor, colorFreq.get(prevColor) - 1);
                if(colorFreq.get(prevColor) == 0) colorFreq.remove(prevColor);
            }
            ballColor.put(ball, color);
            colorFreq.put(color, colorFreq.getOrDefault(color, 0) + 1);
            res.add(colorFreq.size());
        } return res.stream().mapToInt(Integer :: intValue).toArray();
        
    }
    public static void main(String[] args) {
        findTheNumberOfColorBalls a = new findTheNumberOfColorBalls();
        int[][] queries = {{1, 4}, {2, 5}, {1, 3}, {3, 4}};
        System.out.println(Arrays.toString(a.find_Distinct_Color_Among_Balls(4, queries)));
        
    }
}

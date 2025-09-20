// Time Complexity: O(n log n)
import java.util.Arrays;

public class minimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points){
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1, arrowPos = points[0][1];
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > arrowPos){
                arrows++;
                arrowPos = points[i][1];
            }
        } return arrows;
    }
    public static void main(String[] args){
        minimumNumberOfArrowsToBurstBalloons a = new minimumNumberOfArrowsToBurstBalloons();
        int[][] points = {{1, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(a.findMinArrowShots(points));
    }
}

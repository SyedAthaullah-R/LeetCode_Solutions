// Time Complexity: O(n)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval){
        List<int[]> res = new ArrayList<>();
        for(int[] interval : intervals){
            if(interval[1] < newInterval[0]) res.add(interval);
            else if(newInterval[1] < interval[0]){
                res.add(newInterval);
                newInterval = interval;
            }
            else{
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args){
        insertInterval a = new insertInterval();
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        System.out.println(Arrays.deepToString(a.insert(intervals, newInterval)));
    }
}

// Time Complexity: O(n)
public class minimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int point = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);
            point += Math.min(dx, dy) + Math.abs(dy - dx);
        }
        return point;
    }

    public static void main(String[] args) {
        minimumTimeVisitingAllPoints a = new minimumTimeVisitingAllPoints();
        int[][] points = { { 1, 1 }, { 3, 4 }, { -1, 0 } };
        System.out.println(a.minTimeToVisitAllPoints(points));
    }
}

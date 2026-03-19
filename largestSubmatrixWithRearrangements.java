
// Time Complexity: O(m * n log n)
import java.util.Arrays;
import java.util.Collections;

public class largestSubmatrixWithRearrangements {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int area = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            Integer[] rowOne = new Integer[n];
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    if (i > 0 && matrix[i][j] > 0)
                        matrix[i][j] += matrix[i - 1][j];
                }
                rowOne[j] = matrix[i][j];
            }
            Arrays.sort(rowOne, Collections.reverseOrder());
            for (int j = 0; j < rowOne.length; j++) {
                area = Math.max(area, rowOne[j] * (j + 1));
            }
        }
        return area;
    }

    public static void main(String[] args) {
        largestSubmatrixWithRearrangements a = new largestSubmatrixWithRearrangements();
        int[][] matrix = { { 0, 0, 1 }, { 1, 1, 1 }, { 1, 0, 1 } };
        System.out.println(a.largestSubmatrix(matrix));
    }
}

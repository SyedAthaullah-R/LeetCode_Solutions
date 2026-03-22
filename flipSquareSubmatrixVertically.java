
// Time Complexity: O(k²)
import java.util.Arrays;

public class flipSquareSubmatrixVertically {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int startRow = x, endRow = x + k - 1;
        int startCol = y, endCol = y + k - 1;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                int temp = grid[i][j];
                grid[i][j] = grid[endRow][j];
                grid[endRow][j] = temp;
            }
            endRow--;
        }
        return grid;
    }

    public static void main(String[] args) {
        flipSquareSubmatrixVertically a = new flipSquareSubmatrixVertically();
        int[][] grid = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(Arrays.deepToString(a.reverseSubmatrix(grid, 1, 0, 3)));
    }
}

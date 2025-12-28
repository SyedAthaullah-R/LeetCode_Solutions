// Time Complexity: O(m + n)
public class countNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0, row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                count += (m - row);
                col--;
            } else
                row++;
        }
        return count;
    }

    public static void main(String[] args) {
        countNegativeNumbersInASortedMatrix a = new countNegativeNumbersInASortedMatrix();
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        System.out.println(a.countNegatives(grid));
    }
}

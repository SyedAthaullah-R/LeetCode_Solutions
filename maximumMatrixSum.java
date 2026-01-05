// Time Complexity: O(n²)
public class maximumMatrixSum {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int count = 0, smallestAbsValue = Integer.MAX_VALUE, n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += Math.abs(matrix[i][j]);
                if (matrix[i][j] < 0)
                    count++;
                smallestAbsValue = Math.min(smallestAbsValue, Math.abs(matrix[i][j]));
            }
        }
        return count % 2 == 0 ? sum : sum - (2 * smallestAbsValue);
    }

    public static void main(String[] args) {
        maximumMatrixSum a = new maximumMatrixSum();
        int[][] matrix = { { 1, -1 }, { -1, 1 } };
        System.out.println(a.maxMatrixSum(matrix));
    }
}

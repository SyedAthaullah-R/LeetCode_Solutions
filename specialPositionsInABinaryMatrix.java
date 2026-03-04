// Time Complexity: O(m * n)
public class specialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int res = 0, m = mat.length, n = mat[0].length;
        int[] rowCount = new int[m], colCount = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0)
                    continue;
                else {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0)
                    continue;
                else if (rowCount[i] == 1 && colCount[j] == 1)
                    res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        specialPositionsInABinaryMatrix a = new specialPositionsInABinaryMatrix();
        int[][] mat = { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 0 } };
        System.out.println(a.numSpecial(mat));
    }
}

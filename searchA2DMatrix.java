// Time Complexity 
// Best Case: O(1)
// Average and Worst Case: O(log(n * m))

public class searchA2DMatrix {
    public boolean search_a_2D_Matrix(int[][] matrix, int target){
        int m = matrix[0].length, n = matrix.length;
        int l = 0, r = m * n - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            int row = mid / m, col = mid % m;
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] <= target) l = mid + 1;
            else r = mid - 1;
        }return false;
    }
    public static void main(String[] args) {
        searchA2DMatrix a = new searchA2DMatrix();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(a.search_a_2D_Matrix(matrix, 16));
    }
}

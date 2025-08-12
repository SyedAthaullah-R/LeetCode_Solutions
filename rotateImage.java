// Time Compplexity: O(n²)
import java.util.Arrays;

public class rotateImage {
    public void rotate(int[][] matrix){
        int l = 0, r = matrix.length - 1;
        while(l < r){
            for(int i = 0; i < r - l; i++){
                int top = l, bottom = r;
                int topLeft = matrix[top][l + i];
                matrix[top][l + i] = matrix[bottom - i][l];
                matrix[bottom - i][l] = matrix[bottom][r - i];
                matrix[bottom][r - i] = matrix[top + i][r];
                matrix[top + i][r] = topLeft;
            }
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        rotateImage a = new rotateImage();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        a.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        
    }
}
// Time Complexity: O(m * n)
import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> Spiral_Order(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int l = 0, r = matrix[0].length;
        int top = 0, bottom = matrix.length;
        while(l < r && top < bottom){
            for(int i = l; i < r; i++)
                res.add(matrix[top][i]);
            top += 1;
            for(int i = top; i < bottom; i++)
                res.add(matrix[i][r - 1]);
            r -= 1;
            if(!(l < r && top < bottom)) break;
            for(int i = r - 1; i >= l; i--)
                res.add(matrix[bottom - 1][i]);
            bottom -= 1;
            for(int i = bottom - 1; i >= top; i--)
                res.add(matrix[i][l]);
            l += 1;
        } return res;
    }
    public static void main(String[] args) {
        spiralMatrix a = new spiralMatrix();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(a.Spiral_Order(matrix));
    }
}

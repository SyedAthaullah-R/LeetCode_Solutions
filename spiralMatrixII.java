// Time Complexity: O(n²)
import java.util.Arrays;

public class spiralMatrixII {
    public int[][] generateMatrix(int n){
        int[][] res = new int[n][n];
        int l = 0, r = res.length;
        int top = 0, bottom = res.length;
        int count = 1;
        while(l < r && top < bottom){
            for(int i = l; i < r; i++)
                res[top][i] = count++;
            top += 1;
            for(int i = top; i < bottom; i++)
                res[i][r - 1] = count++;
            r -= 1;
            if(!(l < r && top < bottom)) break;
            for(int i = r - 1; i >= l; i--)
                res[bottom - 1][i] = count++;
            bottom -= 1;
            for(int i = bottom - 1; i >= top; i--)
                res[i][l] = count++;
            l += 1;
        } return res;
    } 
    public static void main(String[] args){
        spiralMatrixII a = new spiralMatrixII();
        System.out.println(Arrays.deepToString(a.generateMatrix(3)));
    }
}

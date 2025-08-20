// Time Complexty: O(m * n)
import java.util.Arrays;

public class gameOfLife {
    public void Game_of_Life(int[][] board){
        int m = board.length, n = board[0].length;
        int[][] copy = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int count = 0;
                if(board[i][j] == 1){
                    if(j + 1 < n && board[i][j + 1] == 1) count++;
                    if(j - 1 >= 0 && board[i][j - 1] == 1) count++;
                    if(i + 1 < m && board[i + 1][j] == 1) count++;
                    if(i - 1 >= 0 && board[i - 1][j] == 1) count++;
                    if((i + 1 < m && j - 1 >= 0) && board[i + 1][j - 1] == 1) count++;
                    if((i + 1 < m && j + 1 < n) && board[i + 1][j + 1] == 1) count++;
                    if((i - 1 >= 0 && j - 1 >= 0) && board[i - 1][j - 1] == 1) count++;
                    if((i - 1 >= 0 && j + 1 < n) && board[i - 1][j + 1] == 1) count++;
                    if(count >= 2 && count <= 3) copy[i][j] = 1;
                    else if(count > 3) copy[i][j] = 0;
                }
                else{
                    if(j + 1 < n && board[i][j + 1] == 1) count++;
                    if(j - 1 >= 0 && board[i][j - 1] == 1) count++;
                    if(i + 1 < m && board[i + 1][j] == 1) count++;
                    if(i - 1 >= 0 && board[i - 1][j] == 1) count++;
                    if((i + 1 < m && j - 1 >= 0) && board[i + 1][j - 1] == 1) count++;
                    if((i + 1 < m && j + 1 < n) && board[i + 1][j + 1] == 1) count++;
                    if((i - 1 >= 0 && j - 1 >= 0) && board[i - 1][j - 1] == 1) count++;
                    if((i - 1 >= 0 && j + 1 < n) && board[i - 1][j + 1] == 1) count++;
                    if(count == 3) copy[i][j] = 1;
                    else copy[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = copy[i][j];
            }
        }
    }
    public static void main(String[] args){
        gameOfLife a = new gameOfLife();
        int[][] board = {{0, 1, 0} ,{0, 0, 1} ,{1, 1, 1} ,{0, 0, 0}};
        a.Game_of_Life(board);
        System.out.println(Arrays.deepToString(board));
    }
}

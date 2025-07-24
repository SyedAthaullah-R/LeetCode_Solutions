// Time Complexity: O(1)
import java.util.HashSet;

public class validSudoku {
    public boolean isValidSudoku(char[][] board){
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] square = new HashSet[9];
        for(int i = 0; i < 9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            square[i] = new HashSet<>();
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(c == '.') continue;
                int index = (i / 3) * 3 + (j / 3);
                if(row[i].contains(c) || col[j].contains(c) || square[index].contains(c)) return false;
                row[i].add(c);
                col[j].add(c);
                square[index].add(c);
            }
        } return true;
    }
    public static void main(String[] args) {
        validSudoku a = new validSudoku();
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(a.isValidSudoku(board));
    }
}

// Time Complexity: O(n!)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NQueens {
    HashSet<Integer> col = new HashSet<>();
    HashSet<Integer> posDia = new HashSet<>();
    HashSet<Integer> negDia = new HashSet<>();
    List<List<String>> res = new ArrayList<>();
    public void backTrack(int r, int n, char[][] boards){
        if(r == n){
            List<String> copy = new ArrayList<>();
            for(char[] row : boards)
                copy.add(new String(row));
            res.add(copy);
            return;
        }
        for(int c = 0; c < n; c++){
            if(col.contains(c) || posDia.contains(r + c) || negDia.contains(r - c)) continue;
            col.add(c);
            posDia.add(r + c);
            negDia.add(r - c);
            boards[r][c] = 'Q';
            backTrack(r + 1, n, boards);
            col.remove(c);
            posDia.remove(r + c);
            negDia.remove(r - c);
            boards[r][c] = '.';
        }
    }
    public List<List<String>> N_Queens(int n){
        char[][] boards = new char[n][n];
        for(char[] row : boards)
            Arrays.fill(row, '.');
        backTrack(0, n, boards);
        return res;
    }
    public static void main(String[] args) {
        NQueens a = new NQueens();
        System.out.println(a.N_Queens(4));
        
    }
}

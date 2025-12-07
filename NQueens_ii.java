// Time Complexity: O(n!)
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NQueens_ii {
    HashSet<Integer> col = new HashSet<>();
    HashSet<Integer> posDia = new HashSet<>();
    HashSet<Integer> negDia = new HashSet<>();
    List<Integer> res = new ArrayList<>();
    public void backTrack(int r, int n){
        if(r == n){
            if(res.size() == 0) res.add(1);
            else res.add(res.get(0) + 1);
            return;
        }
        for(int c = 0; c < n; c++){
            if(col.contains(c) || posDia.contains(r + c) || negDia.contains(r - c)) continue;
            col.add(c);
            posDia.add(r + c);
            negDia.add(r - c);
            backTrack(r + 1, n);
            col.remove(c);
            posDia.remove(r + c);
            negDia.remove(r - c);
        }
    }
    public int totalNQueens(int n){
        backTrack(0, n);
        return res.size();
    }
    public static void main(String[] args){
        NQueens_ii a = new NQueens_ii();
        System.out.println(a.totalNQueens(4));
    }
}

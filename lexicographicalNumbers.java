// Time Complexity: O(n)
import java.util.ArrayList;
import java.util.List;

public class lexicographicalNumbers {
    public List<Integer> Lexicographical_Numbers(int n){
        List<Integer> res = new ArrayList<>();
        int curr = 1;
        for(int i = 0; i < n; i++){
            res.add(curr);
            if(curr * 10 <= n) curr *= 10;
            else{
                while(curr == n || curr % 10 == 9) curr /= 10;
                curr++;
            }
        } return res;
    }
    public static void main(String[] args) {
        lexicographicalNumbers a = new lexicographicalNumbers();
        System.out.println(a.Lexicographical_Numbers(13));
    }
}

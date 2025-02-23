// Time Complexity: O(n log n)
import java.util.Arrays;
public class HIndex {
    public int H_Index(int[] citations){
        Arrays.sort(citations);
        int n = citations.length;
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(citations[mid] == (n - mid)) return citations[mid];
            else if(citations[mid] < (n - mid)) l = mid + 1;
            else r = mid - 1;
        } return n - l;
    }
    public static void main(String[] args) {
        HIndex a = new HIndex();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(a.H_Index(citations));
    }
}

//  Time Complexity: O(log n)
public class HIndex_ii {
    public int H_Index_ii(int[] citations){
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
        HIndex_ii a = new HIndex_ii();
        int[] citations = {0, 1, 3, 5, 6};
        System.out.println(a.H_Index_ii(citations));
    }
}

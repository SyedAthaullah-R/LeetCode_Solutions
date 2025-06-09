// Time Complexity: O(n)
public class kthSmallestinLexicographicalOrder {
    public long findCount(int curr, int n){
        long currL = curr;
        long res = 0, nei = currL + 1;
        while(currL <= n){
            res += Math.min(nei, (long) n + 1) - currL;
            currL *= 10;
            nei *= 10;
        } return res;
    }
    public int kth_Smallest_Lexicographical_Order(int n, int k){
        int i = 1, curr = 1;
        while(i < k){
            long steps = findCount(curr, n);
            if(i + steps <= k){
                curr++;
                i += steps;
            }
            else{
                curr *= 10;
                i++;
            }
        } return curr;
    }
    public static void main(String[] args) {
        kthSmallestinLexicographicalOrder a = new kthSmallestinLexicographicalOrder();
        System.out.println(a.kth_Smallest_Lexicographical_Order(13, 2));
    }
}


// Time Complexity: O(n log n)
import java.util.Arrays;

public class minimumCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        int res = 0;
        Arrays.sort(cost);
        for (int l = 0, r = cost.length - 1; l < r; l++, r--) {
            int temp = cost[l];
            cost[l] = cost[r];
            cost[r] = temp;
        }
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 != 2)
                res += cost[i];
        }
        return res;
    }

    public static void main(String[] args) {
        minimumCostOfBuyingCandiesWithDiscount a = new minimumCostOfBuyingCandiesWithDiscount();
        int[] cost = { 1, 2, 3 };
        System.out.println(a.minimumCost(cost));
    }
}

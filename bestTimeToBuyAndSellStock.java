// Time Complexity: O(n)

public class bestTimeToBuyAndSellStock {
    public int best_Time_To_Buy_Sell_Stock(int[] prices){
        int max = 0, l = 0;
        for(int r = 1; r < prices.length; r++){
            if(prices[l] > prices[r]) l = r;
            else max = Math.max(max, prices[r] - prices[l]);
        } return max;
    }
    public static void main(String[] args) {
        bestTimeToBuyAndSellStock a = new bestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(a.best_Time_To_Buy_Sell_Stock(prices));
    }
}

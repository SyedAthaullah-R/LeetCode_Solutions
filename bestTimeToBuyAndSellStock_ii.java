// Time Complexity: O(n)

public class bestTimeToBuyAndSellStock_ii {
    public int best_Time_to_Buy_Sell_Stock_ii(int[] prices){
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
        } return profit;
    }
    public static void main(String[] args) {
        bestTimeToBuyAndSellStock_ii a = new bestTimeToBuyAndSellStock_ii();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(a.best_Time_to_Buy_Sell_Stock_ii(prices));
    }
}

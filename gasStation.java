// Time Complexity: O(n)
public class gasStation {
    public int Gas_Station(int[] gas, int[] cost){
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < gas.length; i++){
            sum1 += gas[i];
            sum2 += cost[i];
        }
        if(sum1 < sum2) return - 1;
        int total = 0, res = 0;
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                res = i + 1;
            }
        } return res;
    }
    public static void main(String[] args) {
        gasStation a = new gasStation();
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
        System.out.println(a.Gas_Station(gas, cost));   
    }
}

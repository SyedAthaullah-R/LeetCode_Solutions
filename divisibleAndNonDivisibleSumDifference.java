// Time Complexity: O(n)
public class divisibleAndNonDivisibleSumDifference {
    public int divisible_and_Non_Divisible_Summ_Difference(int n, int m){
        int res1 = 0, res2 = 0;
        for(int i = 1; i <= n; i++){
            if(i % m != 0) res1 +=i;
            else res2 += i;
        } return res1 - res2;
    }
    public static void main(String[] args) {
        divisibleAndNonDivisibleSumDifference a = new divisibleAndNonDivisibleSumDifference();
        System.out.println(a.divisible_and_Non_Divisible_Summ_Difference(10, 3));
    }
}

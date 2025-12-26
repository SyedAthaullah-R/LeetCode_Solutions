// Time Complexity: O(n)
public class minimumPenaltyForAShop {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] prefix = new int[n + 1], postfix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1];
            if (customers.charAt(i - 1) == 'N')
                prefix[i] += 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            postfix[i] = postfix[i + 1];
            if (customers.charAt(i) == 'Y')
                postfix[i] += 1;
        }
        int index = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            int penalty = prefix[i] + postfix[i];
            if (penalty < min) {
                min = penalty;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        minimumPenaltyForAShop a = new minimumPenaltyForAShop();
        System.out.println(a.bestClosingTime("YYNY"));
    }
}

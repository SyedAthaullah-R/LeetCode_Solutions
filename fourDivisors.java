// Time Complexity: O(n * √m)
public class fourDivisors {
    public int getDivisorsSum(int n) {
        int count = 0, sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                count++;
                if (i != (n / i)) {
                    sum += n / i;
                    count++;
                }
            }
            if (count > 4)
                break;
        }
        return count == 4 ? sum : 0;
    }

    public int sumFourDivisors(int[] nums) {
        int res = 0;
        for (int i : nums)
            res += getDivisorsSum(i);
        return res;
    }

    public static void main(String[] args) {
        fourDivisors a = new fourDivisors();
        int[] nums = { 21, 4, 7 };
        System.out.println(a.sumFourDivisors(nums));
    }
}

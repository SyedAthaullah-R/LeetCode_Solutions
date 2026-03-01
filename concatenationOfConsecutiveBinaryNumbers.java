// Time Complexity: O(n)
public class concatenationOfConsecutiveBinaryNumbers {
    public int concatenatedBinary(int n) {
        int bits = 0, m = 1_000_000_007;
        long res = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0)
                bits++;
            res = (((res << bits) % m) + i) % m;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        concatenationOfConsecutiveBinaryNumbers a = new concatenationOfConsecutiveBinaryNumbers();
        System.out.println(a.concatenatedBinary(3));
    }
}

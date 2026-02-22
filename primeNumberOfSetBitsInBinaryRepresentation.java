// Time Complexity: O(n * √m)
public class primeNumberOfSetBitsInBinaryRepresentation {
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            String num = Integer.toBinaryString(i);
            int count = 0;
            for (char c : num.toCharArray())
                if (c == '1')
                    count++;
            if (isPrime(count))
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        primeNumberOfSetBitsInBinaryRepresentation a = new primeNumberOfSetBitsInBinaryRepresentation();
        System.out.println(a.countPrimeSetBits(6, 10));
    }
}

// Time Complexity: O(log n)
public class checkDivisibilityByDigitSumAndProduct {
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int prodOfDigits(int n) {
        int prod = 1;
        while (n != 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }

    public boolean checkDivisibility(int n) {
        int res = sumOfDigits(n) + prodOfDigits(n);
        return (n % res == 0);
    }

    public static void main(String[] args) {
        checkDivisibilityByDigitSumAndProduct a = new checkDivisibilityByDigitSumAndProduct();
        System.out.println(a.checkDivisibility(99));
    }
}

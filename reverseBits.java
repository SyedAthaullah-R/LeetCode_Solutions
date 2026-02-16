// Time Complexity: O(n)
public class reverseBits {
    public int getDecimal(String s) {
        int i = s.length() - 1, res = 0, count = 0;
        while (i >= 0) {
            if (s.charAt(i) == '1')
                res += 1 * Math.pow(2, count);
            count++;
            i--;
        }
        return res;
    }

    public int reverse_Bits(int n) {
        String binary = Integer.toBinaryString(n);
        while (binary.length() < 32)
            binary = '0' + binary;
        String reversed = new StringBuilder(binary).reverse().toString();
        return getDecimal(reversed);
    }

    public static void main(String[] args) {
        reverseBits a = new reverseBits();
        System.out.println(a.reverse_Bits(43261596));
    }
}

// Time Complexity: O(log n)
public class complementOfBase10Integer {
    public int binaryComplementToDecimal(String s) {
        int res = 0, count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            res += (s.charAt(i) == '0' ? 1 : 0) * Math.pow(2, count++);
        }
        return res;
    }

    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        return binaryComplementToDecimal(s);
    }

    public static void main(String[] args) {
        complementOfBase10Integer a = new complementOfBase10Integer();
        System.out.println(a.bitwiseComplement(5));
    }
}

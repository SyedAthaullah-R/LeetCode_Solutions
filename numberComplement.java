// Time Complexity: O(log n)
public class numberComplement {
    public int binaryComplementToDecimal(String s) {
        int res = 0, count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            res += (s.charAt(i) == '0' ? 1 : 0) * Math.pow(2, count++);
        }
        return res;
    }

    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        return binaryComplementToDecimal(s);
    }

    public static void main(String[] args) {
        numberComplement a = new numberComplement();
        System.out.println(a.findComplement(5));
    }
}

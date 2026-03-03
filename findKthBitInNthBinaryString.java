// Time Complexity: O(2ⁿ)
public class findKthBitInNthBinaryString {
    public StringBuilder invertBits(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++)
            sb.setCharAt(i, sb.charAt(i) == '0' ? '1' : '0');
        return sb;
    }

    public String recursion(StringBuilder sb, int n) {
        if (n < 0)
            return sb.toString();
        StringBuilder s = new StringBuilder(sb);
        s.append(1);
        sb = invertBits(sb).reverse();
        sb = s.append(sb);
        return recursion(sb, n - 1);
    }

    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        String res = recursion(sb, n);
        return res.charAt(k - 1);
    }

    public static void main(String[] args) {
        findKthBitInNthBinaryString a = new findKthBitInNthBinaryString();
        System.out.println(a.findKthBit(3, 2));
    }
}

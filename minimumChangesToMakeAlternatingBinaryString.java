// Time Complexity: O(n)
public class minimumChangesToMakeAlternatingBinaryString {
    public int minOperations(String s) {
        int zeroCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '1')
                    zeroCount++;
            } else {
                if (s.charAt(i) == '0')
                    zeroCount++;
            }
        }
        int oneCount = s.length() - zeroCount;
        return Math.min(zeroCount, oneCount);
    }

    public static void main(String[] args) {
        minimumChangesToMakeAlternatingBinaryString a = new minimumChangesToMakeAlternatingBinaryString();
        System.out.println(a.minOperations("10010100"));
    }
}

// Time Complexity: O(n)
public class checkIfBinaryStringHasAtMostOneSegmentOfOnes {
    public boolean checkOnesSegment(String s) {
        for (int i = 1; i < s.length() - 1; i++)
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1')
                return false;
        return true;
    }

    public static void main(String[] args) {
        checkIfBinaryStringHasAtMostOneSegmentOfOnes a = new checkIfBinaryStringHasAtMostOneSegmentOfOnes();
        System.out.println(a.checkOnesSegment("1001"));
    }
}
